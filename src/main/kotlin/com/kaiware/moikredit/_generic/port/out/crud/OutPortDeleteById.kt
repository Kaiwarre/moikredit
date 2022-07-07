package com.kaiware.moikredit._generic.port.out.crud

import com.kaiware.moikredit._generic.data.EntityI

interface OutPortDeleteById<Entity: EntityI, Id:Any> {
    fun execute(id: Id)
}