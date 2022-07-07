package com.kaiware.moikredit._generic.port.`in`.crud.abstract_impl

import com.kaiware.moikredit._generic.data.EntityI
import com.kaiware.moikredit._generic.data.SaveDtoI
import com.kaiware.moikredit._generic.port.`in`.crud.InPortSave
import com.kaiware.moikredit._generic.usecase.UseCaseSave


abstract class InPortSaveAbstractImpl<Entity: EntityI,Id:Any,SaveDto: SaveDtoI>
    : InPortSave<SaveDto>
{
    protected abstract val useCaseInPortSave: UseCaseSave<SaveDto>
}