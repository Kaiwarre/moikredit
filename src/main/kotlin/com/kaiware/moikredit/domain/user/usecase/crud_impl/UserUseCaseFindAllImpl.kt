package com.kaiware.moikredit.domain.user.usecase.crud_impl



import com.kaiware.moikredit._generic.port.out.crud.OutPortFindAll
import com.kaiware.moikredit._generic.usecase.abstract_find_impl.UseCaseFindAllAbstractImpl
import com.kaiware.moikredit._generic.util.Mapper
import com.kaiware.moikredit.annotation.UseCase
import com.kaiware.moikredit.domain.user.User
import com.kaiware.moikredit.domain.user.dto.UserResponseDto

@UseCase
class UserUseCaseFindAllImpl(
    override val outPortFindAll: OutPortFindAll<User>,
    override val mapper: Mapper<User, UserResponseDto>
) : UseCaseFindAllAbstractImpl<User, UserResponseDto>()