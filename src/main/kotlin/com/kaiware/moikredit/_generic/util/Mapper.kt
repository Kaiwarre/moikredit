package com.kaiware.moikredit._generic.util

import com.kaiware.moikredit.AppLanguages
import com.kaiware.moikredit._generic.data.EntityI
import com.kaiware.moikredit._generic.data.ResponseDtoI


interface Mapper<Entity: EntityI, ResponseDto: ResponseDtoI> {
   fun toResponseDto(entity:Entity, lang:String = AppLanguages.Ru.toString()): ResponseDto
}