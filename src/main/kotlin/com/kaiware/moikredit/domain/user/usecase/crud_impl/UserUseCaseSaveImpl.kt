package com.kaiware.moikredit.domain.user.usecase.crud_impl


import com.kaiware.moikredit._generic.port.out.crud.OutPortSave
import com.kaiware.moikredit._generic.usecase.abstract_impl.UseCaseSaveAbstractImpl
import com.kaiware.moikredit.annotation.UseCase
import com.kaiware.moikredit.domain.user.dto.UserSaveDto
import com.kaiware.moikredit.domain.role.port.out.RoleOutPortFindByName
import com.kaiware.moikredit.domain.user.User
import com.kaiware.moikredit.domain.user.UserRoles
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

@UseCase
class UserUseCaseSaveImpl(
    override val outPortSave: OutPortSave<User>,
    private val roleOutPortFindByName: RoleOutPortFindByName,
    private val passwordEncoder: BCryptPasswordEncoder
) : UseCaseSaveAbstractImpl<User, UserSaveDto>(){

    override fun execute(saveDto: UserSaveDto) {
        outPortSave.execute(
            User(
                name = saveDto.name,
                email = saveDto.email,
                password = passwordEncoder.encode(saveDto.password),
                roles = mutableSetOf(roleOutPortFindByName.findByName(UserRoles.User.toString()))
            )
        )
    }

}