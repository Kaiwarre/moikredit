package com.kaiware.moikredit.domain.markdown


interface MarkdownInPortFindByName {
    fun execute(name:String, lang:String):Any
}