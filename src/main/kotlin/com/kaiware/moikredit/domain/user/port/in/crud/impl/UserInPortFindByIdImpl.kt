package com.kaiware.moikredit.domain.user.port.`in`.crud.impl

import com.kaiware.moikredit._generic.port.`in`.crud.abstract_impl.InPortFindByIdAbstractImpl
import com.kaiware.moikredit._generic.usecase.UseCaseFindById
import com.kaiware.moikredit.annotation.InPort
import com.kaiware.moikredit.domain.user.User
import com.kaiware.moikredit.domain.user.dto.UserResponseDto
import com.kaiware.moikredit.domain.user.UserApiPath
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@InPort
class UserInPortFindByIdImpl(
    override val useCaseFindById: UseCaseFindById<User, Long, UserResponseDto>
) : InPortFindByIdAbstractImpl<User, Long, UserResponseDto>() {

    @GetMapping(UserApiPath.findByIdPath)
    override fun execute(@PathVariable id: Long, @PathVariable lang: String): ResponseEntity<UserResponseDto> {
        return ResponseEntity(useCaseFindById.execute(id,lang),HttpStatus.OK)
    }

}