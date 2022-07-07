package com.kaiware.moikredit._generic.usecase

import com.kaiware.moikredit._generic.data.ResponseDtoI
import org.springframework.data.domain.Page

interface UseCaseFindAllPaginated<ResponseDto: ResponseDtoI> {
    fun execute(pageNumber: Int,pageSize:Int, lang:String): Page<ResponseDto>
}