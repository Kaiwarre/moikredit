package com.konzerra.academic_journal_kstu.domain.user.port.`in`.crud.impl

import com.kaiware.moikredit._generic.port.`in`.crud.abstract_impl.InPortFindAllAbstractImpl
import com.kaiware.moikredit._generic.usecase.UseCaseFindAll
import com.kaiware.moikredit.annotation.InPort
import com.kaiware.moikredit.domain.user.User
import com.kaiware.moikredit.domain.user.dto.UserResponseDto
import com.kaiware.moikredit.domain.user.UserApiPath
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@InPort
class UserInPortFindAllImpl(
    override val useCaseFindAll: UseCaseFindAll<User, UserResponseDto>
) : InPortFindAllAbstractImpl<User, UserResponseDto>() {

    @GetMapping(UserApiPath.findAllPath)
    override fun execute(@PathVariable lang:String): ResponseEntity<List<UserResponseDto>> {
        return ResponseEntity(useCaseFindAll.execute(lang),HttpStatus.OK)
    }
}