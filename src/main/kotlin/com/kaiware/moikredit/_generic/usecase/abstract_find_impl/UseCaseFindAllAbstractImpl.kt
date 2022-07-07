package com.kaiware.moikredit._generic.usecase.abstract_find_impl

import com.kaiware.moikredit._generic.data.EntityI
import com.kaiware.moikredit._generic.data.ResponseDtoI
import com.kaiware.moikredit._generic.port.out.crud.OutPortFindAll
import com.kaiware.moikredit._generic.usecase.UseCaseFindAll
import com.kaiware.moikredit._generic.util.Mapper

abstract class UseCaseFindAllAbstractImpl<Entity: EntityI, ResponseDto: ResponseDtoI>
    : UseCaseFindAll<Entity, ResponseDto> {
    protected abstract val outPortFindAll: OutPortFindAll<Entity>
    protected abstract val mapper: Mapper<Entity, ResponseDto>
    override fun execute(lang:String): List<ResponseDto> {
        val list = outPortFindAll.findAll()
        return list.map {
            mapper.toResponseDto(it,lang)
        }
    }
}