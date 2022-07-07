package com.kaiware.moikredit._generic.port.`in`.crud

import com.kaiware.moikredit._generic.data.SaveDtoI

interface InPortSave<SaveDto: SaveDtoI> {
    fun execute(saveDto: SaveDto): Any
}