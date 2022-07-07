package com.kaiware.moikredit._generic.port.`in`.crud.abstract_impl

import com.kaiware.moikredit._generic.data.EntityI
import com.kaiware.moikredit._generic.data.ResponseDtoI
import com.kaiware.moikredit._generic.port.`in`.crud.InPortFindById
import com.kaiware.moikredit._generic.usecase.UseCaseFindById


abstract class InPortFindByIdAbstractImpl<Entity: EntityI,Id:Any,ResponseDto: ResponseDtoI>
    : InPortFindById<Id>
{
    protected abstract val useCaseFindById: UseCaseFindById<Entity, Id, ResponseDto>
}