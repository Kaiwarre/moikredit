package com.kaiware.moikredit.domain.user.port.out.crud_impl

import com.kaiware.moikredit._generic.port.out.crud.OutPortFindAll
import com.kaiware.moikredit.annotation.OutPort
import com.kaiware.moikredit.domain.user.User
import com.kaiware.moikredit.domain.user.UserRepository

@OutPort
class UserOutPortFindAllImpl(
    private val repository: UserRepository
): OutPortFindAll<User> {
    override fun findAll(): List<User> {
        return repository.findAll()
    }

}