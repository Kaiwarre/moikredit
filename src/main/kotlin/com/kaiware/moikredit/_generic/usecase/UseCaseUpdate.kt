package com.kaiware.moikredit._generic.usecase

import com.kaiware.moikredit._generic.data.UpdateDtoI


interface UseCaseUpdate<UpdateDto : UpdateDtoI> {
    fun execute(updateDto: UpdateDto)
}