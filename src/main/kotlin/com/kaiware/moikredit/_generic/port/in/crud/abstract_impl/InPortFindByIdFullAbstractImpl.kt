package com.kaiware.moikredit._generic.port.`in`.crud.abstract_impl

import com.kaiware.moikredit._generic.data.ResponseDtoI
import com.kaiware.moikredit._generic.port.`in`.crud.InPortFindByIdFull
import com.kaiware.moikredit._generic.usecase.UseCaseFindByIdFull

abstract class InPortFindByIdFullAbstractImpl<Id:Any,FullResponseDto: ResponseDtoI>
    : InPortFindByIdFull<Id>
{
    protected abstract val useCaseFindByIdFull: UseCaseFindByIdFull<FullResponseDto, Id>
}