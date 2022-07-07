package com.kaiware.moikredit.domain.user.port.`in`.crud.impl

import com.kaiware.moikredit._generic.port.`in`.crud.abstract_impl.InPortSaveAbstractImpl
import com.kaiware.moikredit._generic.usecase.UseCaseSave
import com.kaiware.moikredit.annotation.InPort
import com.kaiware.moikredit.domain.user.User
import com.kaiware.moikredit.domain.user.dto.UserSaveDto
import com.kaiware.moikredit.domain.user.UserApiPath
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@InPort
class UserInPortSaveImpl(
    override val useCaseInPortSave: UseCaseSave<UserSaveDto>
) : InPortSaveAbstractImpl<User, Long, UserSaveDto>() {

    @PostMapping(UserApiPath.savePath)
    override fun execute(@RequestBody saveDto: UserSaveDto): ResponseEntity<*> {
        useCaseInPortSave.execute(saveDto)
        return ResponseEntity<Any>(HttpStatus.CREATED)
    }
}