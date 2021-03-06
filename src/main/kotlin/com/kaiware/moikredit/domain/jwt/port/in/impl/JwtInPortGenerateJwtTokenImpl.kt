package com.kaiware.moikredit.domain.jwt.port.`in`.impl

import com.kaiware.moikredit.annotation.InPort
import com.kaiware.moikredit.domain.jwt.dto.JwtRequestDto
import com.kaiware.moikredit.domain.jwt.dto.JwtResponseDto
import com.kaiware.moikredit.domain.jwt.JwtApiPath
import com.kaiware.moikredit.domain.jwt.port.`in`.JwtInPortGenerateJwtToken
import com.kaiware.moikredit.domain.jwt.usecase.JwtUseCaseGenerateJwtToken
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestHeader

@InPort
class JwtInPortGenerateJwtTokenImpl(
    private val jwtUseCaseGenerateJwtToken: JwtUseCaseGenerateJwtToken
) : JwtInPortGenerateJwtToken {


    @PostMapping(JwtApiPath.generateJwtTokenPath)
    override fun generateToken(
        @RequestBody jwtRequestDto: JwtRequestDto,
        @RequestHeader("Accept-Language") lang:String
    ): ResponseEntity<JwtResponseDto> {
        return ResponseEntity(jwtUseCaseGenerateJwtToken.execute(jwtRequestDto,lang),HttpStatus.OK)
    }
}