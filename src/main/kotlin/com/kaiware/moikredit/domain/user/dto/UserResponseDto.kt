package com.kaiware.moikredit.domain.user.dto


import com.kaiware.moikredit._generic.data.ResponseDtoI
import com.kaiware.moikredit._generic.util.Mapper
import com.kaiware.moikredit.domain.user.User
import com.kaiware.moikredit.domain.role.dto.RoleResponseDto
import org.springframework.stereotype.Component


class UserResponseDto(
    var id:Long? = null,
    var name:String,
    var email:String,
    var roles:List<RoleResponseDto>,
) : ResponseDtoI
{

    @Component
    companion object: Mapper<User, UserResponseDto> {
        override fun toResponseDto(entity: User, lang:String): UserResponseDto {
            return UserResponseDto(
                id = entity.id,
                email = entity.email,
                name = entity.name,
                roles = entity.roles.map{

                    RoleResponseDto(it.name)

                }
            )
        }
    }
}