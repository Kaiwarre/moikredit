package com.kaiware.moikredit.domain.role.port.out

import com.kaiware.moikredit.domain.role.Role

interface RoleOutPortFindByName {
    fun findByName(name:String): Role
}