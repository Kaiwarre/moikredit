package com.kaiware.moikredit._generic.usecase.abstract_impl

import com.kaiware.moikredit._generic.data.EntityI
import com.kaiware.moikredit._generic.data.SaveDtoI
import com.kaiware.moikredit._generic.port.out.crud.OutPortSave
import com.kaiware.moikredit._generic.usecase.UseCaseSave



abstract class UseCaseSaveAbstractImpl<Entity: EntityI,SaveDto: SaveDtoI>
     : UseCaseSave<SaveDto>
{
    protected abstract val outPortSave: OutPortSave<Entity>
}