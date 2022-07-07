package com.kaiware.moikredit._generic.usecase

import com.kaiware.moikredit._generic.data.EntityI
import com.kaiware.moikredit._generic.data.ResponseDtoI


interface UseCaseFindAll<Entity : EntityI, ResponseDto : ResponseDtoI> {
    fun execute(lang:String): List<ResponseDto>
}