package com.kaiware.moikredit._generic.usecase.abstract_impl

import com.kaiware.moikredit._generic.data.EntityI
import com.kaiware.moikredit._generic.port.out.crud.OutPortDeleteById
import com.kaiware.moikredit._generic.usecase.UseCaseDeleteById

abstract class UseCaseDeleteByIdAbstractImpl<Entity: EntityI, Id:Any>
    : UseCaseDeleteById<Entity, Id>
{
    protected abstract val outPortDeleteById: OutPortDeleteById<Entity, Id>
    override fun execute(id: Id) {
        outPortDeleteById.execute(id)
    }
}
