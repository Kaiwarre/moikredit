package com.kaiware.moikredit.domain.jwt.usecase.impl


import com.kaiware.moikredit._generic.util.Mapper
import com.kaiware.moikredit.annotation.UseCase
import com.kaiware.moikredit.configuration.security.util.JwtUtil
import com.kaiware.moikredit.domain.jwt.dto.JwtRequestDto
import com.kaiware.moikredit.domain.jwt.dto.JwtResponseDto
import com.kaiware.moikredit.domain.jwt.usecase.JwtUseCaseGenerateJwtToken
import com.kaiware.moikredit.domain.user.User
import com.kaiware.moikredit.domain.user.dto.UserResponseDto
import com.kaiware.moikredit.domain.user.port.out.UserOutPortFindByEmail
import com.kaiware.moikredit.domain.user.port.out.UserOutPortGetDetails

import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.authentication.BadCredentialsException
import org.springframework.security.authentication.DisabledException
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.core.userdetails.UserDetails

@UseCase
class JwtUseCaseGenerateJwtTokenImpl(
    private val jwtUtil: JwtUtil,
    private val userOutPortGetDetails: UserOutPortGetDetails,
    private val authenticationManager: AuthenticationManager,
    private val userOutPortFindByEmail: UserOutPortFindByEmail,
    private val userMapper: Mapper<User, UserResponseDto>,
) : JwtUseCaseGenerateJwtToken {

    override fun execute(jwtRequestDto: JwtRequestDto, lang:String): JwtResponseDto {
        val email: String = jwtRequestDto.email
        val userPassword: String = jwtRequestDto.password
        authenticate(email, userPassword)

        val userDetails: UserDetails = userOutPortGetDetails.loadUserByUsername(email)
        val newGeneratedToken = jwtUtil.generateToken(userDetails)

        val userResponseDto: UserResponseDto = userMapper
            .toResponseDto(userOutPortFindByEmail.execute(email), lang)
        return JwtResponseDto(newGeneratedToken, userResponseDto)
    }


    private fun authenticate(userName: String, userPassword: String) {
        try {
            authenticationManager.authenticate(UsernamePasswordAuthenticationToken(userName, userPassword))
        } catch (e: DisabledException) {
            throw Exception("USER_DISABLED", e)
        } catch (e: BadCredentialsException) {
            throw Exception("INVALID_CREDENTIALS", e)
        }
    }
}