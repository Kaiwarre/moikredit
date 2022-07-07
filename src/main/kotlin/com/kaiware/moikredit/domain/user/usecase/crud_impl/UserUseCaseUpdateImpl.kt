package com.kaiware.moikredit.domain.user.usecase.crud_impl


import com.kaiware.moikredit._generic.port.out.crud.OutPortFindById
import com.kaiware.moikredit._generic.port.out.crud.OutPortSave
import com.kaiware.moikredit._generic.usecase.abstract_impl.UseCaseUpdateAbstractImpl
import com.kaiware.moikredit.annotation.UseCase
import com.kaiware.moikredit.domain.user.dto.UserUpdateDto
import com.kaiware.moikredit.domain.user.User

@UseCase
class UserUseCaseUpdateImpl(
    override val outPortSave: OutPortSave<User>,
    override val outPortFindById: OutPortFindById<User, Long>
) : UseCaseUpdateAbstractImpl<User, Long, UserUpdateDto>(){
    override fun execute(updateDto: UserUpdateDto) {
        val user = outPortFindById.execute(updateDto.id)
        user.name = updateDto.name
        outPortSave.execute(user)
    }
}