package com.kaiware.moikredit.domain.role.port.out.impl

import com.kaiware.moikredit.annotation.OutPort
import com.kaiware.moikredit.exception.ResourceNotFoundException
import com.kaiware.moikredit.domain.role.Role
import com.kaiware.moikredit.domain.role.RoleRepository
import com.kaiware.moikredit.domain.role.port.out.RoleOutPortFindByName


@OutPort
class RoleOutPortFindByNameImpl(
    private val repository: RoleRepository
) : RoleOutPortFindByName {
    override fun findByName(name: String): Role {
        try{
            return repository.findRoleByName(name)
        }catch(e:RuntimeException){
            throw ResourceNotFoundException(
                className = Role::class.simpleName ?: "className",
                fieldName = Role::name.name,
                fieldValue = name
            )
        }
    }
}