package com.kaiware.moikredit._generic.port.`in`.crud

import com.kaiware.moikredit._generic.data.EntityI

interface InPortDeleteById<Entity: EntityI, Id:Any> {
    fun execute(id: Id):Any
}