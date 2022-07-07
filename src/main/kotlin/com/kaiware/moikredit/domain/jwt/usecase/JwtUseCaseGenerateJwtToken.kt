package com.kaiware.moikredit.domain.jwt.usecase

import com.kaiware.moikredit.domain.jwt.dto.JwtRequestDto
import com.kaiware.moikredit.domain.jwt.dto.JwtResponseDto


interface JwtUseCaseGenerateJwtToken{
    fun execute(jwtRequestDto: JwtRequestDto, lang:String): JwtResponseDto
}