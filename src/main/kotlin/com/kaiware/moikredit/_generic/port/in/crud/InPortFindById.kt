package com.kaiware.moikredit._generic.port.`in`.crud


interface InPortFindById<Id:Any> {
    fun execute(id:Id,lang:String): Any
}