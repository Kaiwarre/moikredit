package com.kaiware.moikredit.domain.user.usecase.crud_impl



import com.kaiware.moikredit._generic.port.out.crud.OutPortDeleteById
import com.kaiware.moikredit._generic.usecase.abstract_impl.UseCaseDeleteByIdAbstractImpl
import com.kaiware.moikredit.annotation.UseCase
import com.kaiware.moikredit.domain.user.User

@UseCase
class UserUseCaseDeleteByIdImpl(
    override val outPortDeleteById: OutPortDeleteById<User, Long>
) : UseCaseDeleteByIdAbstractImpl<User, Long>()