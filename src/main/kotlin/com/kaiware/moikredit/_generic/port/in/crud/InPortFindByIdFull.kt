package com.kaiware.moikredit._generic.port.`in`.crud

interface InPortFindByIdFull<Id:Any> {
    fun execute(id:Id):Any
}