package com.kaiware.moikredit.domain.user.port.`in`.crud.impl


import com.kaiware.moikredit._generic.port.`in`.crud.abstract_impl.InPortDeleteByIdAbstractImpl
import com.kaiware.moikredit._generic.usecase.UseCaseDeleteById
import com.kaiware.moikredit.annotation.InPort
import com.kaiware.moikredit.domain.user.User
import com.kaiware.moikredit.domain.user.UserApiPath
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PathVariable

@InPort
class UserInPortDeleteByIdImpl(
    override val useCaseDeleteById: UseCaseDeleteById<User, Long>
) : InPortDeleteByIdAbstractImpl<User, Long>()
{
    @DeleteMapping(UserApiPath.deleteByIdPath)
    override fun execute(@PathVariable id: Long): ResponseEntity<*> {
        useCaseDeleteById.execute(id)
        return ResponseEntity<Any>(HttpStatus.OK)
    }
}
