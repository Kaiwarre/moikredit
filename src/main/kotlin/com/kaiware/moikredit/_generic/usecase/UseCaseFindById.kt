package com.kaiware.moikredit._generic.usecase

import com.kaiware.moikredit._generic.data.EntityI
import com.kaiware.moikredit._generic.data.ResponseDtoI


interface UseCaseFindById<Entity : EntityI, Id, ResponseDto : ResponseDtoI> {
    fun execute(id:Id,lang:String): ResponseDto
}