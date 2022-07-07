package com.kaiware.moikredit.domain.user.port.out.impl

import com.kaiware.moikredit.annotation.OutPort
import com.kaiware.moikredit.domain.user.User
import com.kaiware.moikredit.exception.ResourceNotFoundException
import com.kaiware.moikredit.domain.user.UserRepository
import com.kaiware.moikredit.domain.user.port.out.UserOutPortFindByEmail

@OutPort
class UserOutPortFindByEmailImpl(
    private val repository: UserRepository
) : UserOutPortFindByEmail {
    override fun execute(email: String): User {
        try{
            return repository.findByEmail(email)
        }catch(e:RuntimeException){
            throw ResourceNotFoundException(
                className = User::class.simpleName ?: "className",
                fieldName = User::id.name,
                fieldValue = email
            )
        }

    }
}