package com.kaiware.moikredit._generic.port.out.crud

import com.kaiware.moikredit._generic.data.EntityI

interface OutPortFindAll<Entity: EntityI> {
    fun findAll(): List<Entity>
}