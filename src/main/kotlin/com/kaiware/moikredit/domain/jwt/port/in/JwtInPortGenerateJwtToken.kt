package com.kaiware.moikredit.domain.jwt.port.`in`

import com.kaiware.moikredit.domain.jwt.dto.JwtRequestDto
import com.kaiware.moikredit.domain.jwt.dto.JwtResponseDto
import org.springframework.http.ResponseEntity

interface JwtInPortGenerateJwtToken {
    fun generateToken(jwtRequestDto: JwtRequestDto, lang:String):ResponseEntity<JwtResponseDto>
}