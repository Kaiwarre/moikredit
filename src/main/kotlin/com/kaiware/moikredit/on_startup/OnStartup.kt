package com.kaiware.moikredit.on_startup

import com.kaiware.moikredit.domain.role.Role
import com.kaiware.moikredit.domain.role.RoleRepository
import com.kaiware.moikredit.domain.user.User
import com.kaiware.moikredit.domain.user.UserRepository
import com.kaiware.moikredit.domain.user.UserRoles
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.stereotype.Component

@Component
class OnStartup(
    private val roleRepository: RoleRepository,
    private val userRepository: UserRepository,
    private val passwordEncoder: BCryptPasswordEncoder
): ApplicationRunner {
    override fun run(args: ApplicationArguments?) {
        val list: List<Role> = listOf(
            Role(
                name = "Admin"
            ),
            Role(
                name = "User"
            ),
            Role(
                name = "Moderator"
            ),
        )
        //check if role exists before saving
        list.forEach {
            try{
                roleRepository.findRoleByName(it.name)
            }catch(e:RuntimeException) {
                roleRepository.save(it)
            }

        }
        val appUser = User(
            name = "Kairat",
            email = "kairatlolpop@gmail.com",
            password = passwordEncoder.encode("860275376"),
            roles = mutableSetOf(
                roleRepository.findRoleByName(UserRoles.Admin.toString()),
                roleRepository.findRoleByName(UserRoles.User.toString())
            )
        )
        try{
            userRepository.findByEmail("kairatlolpop@gmail.com")
        }
        catch(e:RuntimeException){
            userRepository.save(appUser)
        }
}}