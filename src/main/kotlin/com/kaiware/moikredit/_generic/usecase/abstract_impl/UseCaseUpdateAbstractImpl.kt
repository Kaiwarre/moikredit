package com.kaiware.moikredit._generic.usecase.abstract_impl

import com.kaiware.moikredit._generic.data.EntityI
import com.kaiware.moikredit._generic.data.UpdateDtoI
import com.kaiware.moikredit._generic.port.out.crud.OutPortFindById
import com.kaiware.moikredit._generic.port.out.crud.OutPortSave
import com.kaiware.moikredit._generic.usecase.UseCaseUpdate

abstract class UseCaseUpdateAbstractImpl<Entity: EntityI, Id:Any, UpdateDto: UpdateDtoI>
    : UseCaseUpdate<UpdateDto> {
    protected abstract val outPortSave: OutPortSave<Entity>
    protected abstract val outPortFindById: OutPortFindById<Entity, Id>
}