package com.kaiware.moikredit.domain.user.usecase.crud_impl

import com.kaiware.moikredit._generic.port.out.crud.OutPortFindById
import com.kaiware.moikredit._generic.usecase.abstract_find_impl.UseCaseFindByIdAbstractImpl
import com.kaiware.moikredit._generic.util.Mapper
import com.kaiware.moikredit.annotation.UseCase
import com.kaiware.moikredit.domain.user.User
import com.kaiware.moikredit.domain.user.dto.UserResponseDto

@UseCase
class UserUseCaseFindByIdImpl(
    override val outPortFindById: OutPortFindById<User, Long>,
    override val mapper: Mapper<User, UserResponseDto>
) : UseCaseFindByIdAbstractImpl<User, Long, UserResponseDto>()