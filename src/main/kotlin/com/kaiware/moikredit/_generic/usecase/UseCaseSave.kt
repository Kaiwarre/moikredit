package com.kaiware.moikredit._generic.usecase

import com.kaiware.moikredit._generic.data.SaveDtoI


interface UseCaseSave<SaveDto : SaveDtoI> {
    fun execute(saveDto: SaveDto)
}

