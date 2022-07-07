package com.kaiware.moikredit._generic.port.`in`.crud.abstract_impl

import com.kaiware.moikredit._generic.data.EntityI
import com.kaiware.moikredit._generic.port.`in`.crud.InPortDeleteById
import com.kaiware.moikredit._generic.usecase.UseCaseDeleteById


abstract class InPortDeleteByIdAbstractImpl<Entity: EntityI, Id:Any>
    : InPortDeleteById<Entity, Id> {
    protected abstract val useCaseDeleteById: UseCaseDeleteById<Entity, Id>
}