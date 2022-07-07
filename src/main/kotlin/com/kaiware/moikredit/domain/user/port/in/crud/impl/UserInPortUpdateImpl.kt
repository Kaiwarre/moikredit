package com.kaiware.moikredit.domain.user.port.`in`.crud.impl

import com.kaiware.moikredit._generic.port.`in`.crud.abstract_impl.InPortUpdateAbstractImpl
import com.kaiware.moikredit._generic.usecase.UseCaseUpdate
import com.kaiware.moikredit.annotation.InPort
import com.kaiware.moikredit.domain.user.User
import com.kaiware.moikredit.domain.user.dto.UserUpdateDto
import com.kaiware.moikredit.domain.user.UserApiPath
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PutMapping

@InPort
class UserInPortUpdateImpl(
    override val useCaseUpdate: UseCaseUpdate<UserUpdateDto>
) : InPortUpdateAbstractImpl<User, Long, UserUpdateDto>() {

    @PutMapping(UserApiPath.updatePath)
    override fun execute(updateDto: UserUpdateDto): ResponseEntity<*> {
        useCaseUpdate.execute(updateDto)
        return ResponseEntity<Any>(HttpStatus.OK)
    }
}