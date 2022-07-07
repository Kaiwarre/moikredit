package com.kaiware.moikredit.domain.user.dto

import com.kaiware.moikredit._generic.data.ResponseDtoI
import com.kaiware.moikredit._generic.util.Mapper
import com.kaiware.moikredit.domain.user.User
import org.springframework.stereotype.Component

class SimpleUserResponseDto(
    var id:Long? = null,
    var name:String,
): ResponseDtoI {
    @Component
    companion object: Mapper<User, SimpleUserResponseDto> {
        override fun toResponseDto(entity: User, lang:String): SimpleUserResponseDto {
            return SimpleUserResponseDto(
                id = entity.id,
                name = entity.name
            )
        }
    }
}