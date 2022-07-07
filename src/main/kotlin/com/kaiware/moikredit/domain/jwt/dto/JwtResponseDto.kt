package com.kaiware.moikredit.domain.jwt.dto

import com.kaiware.moikredit.domain.user.dto.UserResponseDto


class JwtResponseDto(
    var jwtToken:String,
    var user: UserResponseDto
) {
}