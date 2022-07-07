package com.kaiware.moikredit._generic.port.`in`.crud

import com.kaiware.moikredit.AppLanguages


interface InPortFindAllPaginated {
    fun execute(pageNumber:Int, pageSize:Int, lang:String = AppLanguages.Ru.toString(),):Any
}