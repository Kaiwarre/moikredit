package com.kaiware.moikredit.domain.user.port.out.crud_impl

import com.kaiware.moikredit._generic.port.out.crud.OutPortSave
import com.kaiware.moikredit.annotation.OutPort
import com.kaiware.moikredit.domain.user.User
import com.kaiware.moikredit.domain.user.UserRepository


@OutPort
class UserOutPortSaveImpl(
    private val repository: UserRepository,
): OutPortSave<User> {
    override fun execute(entity: User) {
        repository.save(entity)
    }
}