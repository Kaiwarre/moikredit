package com.kaiware.moikredit.domain.user.port.out

import com.kaiware.moikredit.domain.user.User


interface UserOutPortFindByEmail {
    fun execute(email:String): User
}