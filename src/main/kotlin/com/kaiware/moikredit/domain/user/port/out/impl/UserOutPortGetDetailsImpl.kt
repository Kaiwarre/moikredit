package com.kaiware.moikredit.domain.user.port.out.impl

import com.kaiware.moikredit.annotation.UseCase
import com.kaiware.moikredit.domain.user.User
import com.kaiware.moikredit.domain.role.Role
import com.kaiware.moikredit.domain.user.port.out.UserOutPortFindByEmail
import com.kaiware.moikredit.domain.user.port.out.UserOutPortGetDetails
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails

@UseCase
class UserOutPortGetDetailsImpl(
    private val userOutPortFindByEmail: UserOutPortFindByEmail
) : UserOutPortGetDetails {
    override fun loadUserByUsername(username: String): UserDetails {
        val user: User = userOutPortFindByEmail.execute(username)

        return org.springframework.security.core.userdetails.User(
            user.email,
            user.password,
            mapRolesToAuthorities(user.roles.toList())
        )
    }
    private fun mapRolesToAuthorities(roles: List<Role>): Collection<GrantedAuthority?> {
        val authorities: List<SimpleGrantedAuthority> = roles.map {
            SimpleGrantedAuthority("ROLE_${it.name}")
        }
        return authorities
    }
}