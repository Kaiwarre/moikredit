package com.kaiware.moikredit._generic.usecase

import com.kaiware.moikredit._generic.data.EntityI


interface UseCaseDeleteById<Entity: EntityI, Id> {
    fun execute(id:Id)
}