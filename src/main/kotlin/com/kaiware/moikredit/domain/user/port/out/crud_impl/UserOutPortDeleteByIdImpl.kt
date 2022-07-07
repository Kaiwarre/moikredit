package com.kaiware.moikredit.domain.user.port.out.crud_impl

import com.kaiware.moikredit._generic.port.out.crud.OutPortDeleteById
import com.kaiware.moikredit.annotation.OutPort
import com.kaiware.moikredit.domain.user.User
import com.kaiware.moikredit.exception.ResourceNotFoundException
import com.kaiware.moikredit.domain.user.UserRepository

@OutPort
class UserOutPortDeleteByIdImpl(
    private val repository: UserRepository
): OutPortDeleteById<User, Long> {
    override fun execute(id: Long) {
        try{
            repository.deleteById(id)
        }catch(e:RuntimeException){
            throw ResourceNotFoundException(
                className = User::class.simpleName ?: "className",
                fieldName = User::id.name,
                fieldValue = id
            )
        }
    }
}