package com.kaiware.moikredit._generic.port.`in`.crud.abstract_impl

import com.kaiware.moikredit._generic.data.EntityI
import com.kaiware.moikredit._generic.data.ResponseDtoI
import com.kaiware.moikredit._generic.port.`in`.crud.InPortFindAll
import com.kaiware.moikredit._generic.usecase.UseCaseFindAll

abstract class InPortFindAllAbstractImpl<Entity: EntityI,ResponseDto: ResponseDtoI>
    : InPortFindAll<ResponseDto> {
    protected abstract val useCaseFindAll: UseCaseFindAll<Entity, ResponseDto>
}