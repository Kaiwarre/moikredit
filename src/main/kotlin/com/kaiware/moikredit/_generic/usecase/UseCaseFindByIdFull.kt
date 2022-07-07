package com.kaiware.moikredit._generic.usecase

import com.kaiware.moikredit._generic.data.ResponseDtoI

interface UseCaseFindByIdFull<FullResponseDto: ResponseDtoI, Id:Any> {
    fun execute(id:Id):FullResponseDto
}