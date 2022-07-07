package com.kaiware.moikredit._generic.port.`in`.crud

import com.kaiware.moikredit._generic.data.ResponseDtoI

interface InPortFindAll<ResponseDto: ResponseDtoI> {
    fun execute(lang:String): Any
}