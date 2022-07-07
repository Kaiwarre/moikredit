package com.kaiware.moikredit.domain.user.port.out.crud_impl

import com.kaiware.moikredit._generic.port.out.crud.OutPortFindById
import com.kaiware.moikredit.annotation.OutPort
import com.kaiware.moikredit.domain.user.User
import com.kaiware.moikredit.exception.ResourceNotFoundException
import com.kaiware.moikredit.domain.user.UserRepository

@OutPort
class UserOutPortFindByIdImpl(
    private val repository: UserRepository
): OutPortFindById<User, Long> {
    override fun execute(id: Long): User {
        return repository.findById(id).orElseThrow {
            ResourceNotFoundException(
                className = User::class.simpleName ?: "className",
                fieldName = User::id.name,
                fieldValue = id
            )
        }


    }
}