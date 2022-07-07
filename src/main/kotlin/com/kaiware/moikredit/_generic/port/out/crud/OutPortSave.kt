package com.kaiware.moikredit._generic.port.out.crud

import com.kaiware.moikredit._generic.data.EntityI

interface OutPortSave<Entity: EntityI> {
    fun execute(entity: Entity)
}