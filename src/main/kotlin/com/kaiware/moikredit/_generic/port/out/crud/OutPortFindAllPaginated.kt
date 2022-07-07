package com.kaiware.moikredit._generic.port.out.crud

import com.kaiware.moikredit._generic.data.EntityI
import org.springframework.data.domain.Page

interface OutPortFindAllPaginated<Entity: EntityI> {
    fun execute(pageNumber: Int, pageSize:Int):Page<Entity>
}