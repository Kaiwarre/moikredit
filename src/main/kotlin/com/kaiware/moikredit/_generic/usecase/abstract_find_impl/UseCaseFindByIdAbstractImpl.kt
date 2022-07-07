package com.kaiware.moikredit._generic.usecase.abstract_find_impl

import com.kaiware.moikredit._generic.data.EntityI
import com.kaiware.moikredit._generic.data.ResponseDtoI
import com.kaiware.moikredit._generic.port.out.crud.OutPortFindById
import com.kaiware.moikredit._generic.usecase.UseCaseFindById
import com.kaiware.moikredit._generic.util.Mapper


abstract class UseCaseFindByIdAbstractImpl<Entity: EntityI,Id:Any, ResponseDto: ResponseDtoI>
    : UseCaseFindById<Entity, Id, ResponseDto> {
    protected abstract val outPortFindById: OutPortFindById<Entity, Id>
    protected abstract val mapper: Mapper<Entity, ResponseDto>

    override fun execute(id: Id,lang:String): ResponseDto {
        return  mapper.toResponseDto(outPortFindById.execute(id),lang)
    }

}