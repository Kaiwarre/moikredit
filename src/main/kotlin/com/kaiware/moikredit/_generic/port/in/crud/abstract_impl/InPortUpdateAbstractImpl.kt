package com.kaiware.moikredit._generic.port.`in`.crud.abstract_impl

import com.kaiware.moikredit._generic.data.EntityI
import com.kaiware.moikredit._generic.data.UpdateDtoI
import com.kaiware.moikredit._generic.port.`in`.crud.InPortUpdate
import com.kaiware.moikredit._generic.usecase.UseCaseUpdate


abstract class InPortUpdateAbstractImpl<Entity: EntityI, Id:Any, UpdateDto: UpdateDtoI>
    : InPortUpdate<UpdateDto>
{
    protected abstract val useCaseUpdate: UseCaseUpdate<UpdateDto>
}