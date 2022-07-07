package com.kaiware.moikredit._generic.port.`in`.crud

import com.kaiware.moikredit._generic.data.UpdateDtoI

interface InPortUpdate<UpdateDto: UpdateDtoI> {
    fun execute(updateDto: UpdateDto): Any
}