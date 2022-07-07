package com.kaiware.moikredit._generic.usecase.abstract_find_impl

import com.kaiware.moikredit._generic.data.EntityI
import com.kaiware.moikredit._generic.data.ResponseDtoI
import com.kaiware.moikredit._generic.port.out.crud.OutPortFindById
import com.kaiware.moikredit._generic.usecase.UseCaseFindByIdFull
import com.kaiware.moikredit._generic.util.Mapper

abstract class UseCaseFindByIdFullAbstractImpl<Entity: EntityI,Id:Any,FullResponseDto: ResponseDtoI>(
    protected val outPortFindById: OutPortFindById<Entity, Id>,
    protected val mapper: Mapper<Entity, FullResponseDto>
): UseCaseFindByIdFull<FullResponseDto, Id> {
    override fun execute(id: Id): FullResponseDto {
        return mapper.toResponseDto(outPortFindById.execute(id))
    }

}