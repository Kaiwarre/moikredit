package com.kaiware.moikredit.domain.markdown.port.out

import com.kaiware.moikredit.domain.markdown.Markdown

interface MarkdownOutPortFindByName {
    fun execute(name:String): Markdown
}