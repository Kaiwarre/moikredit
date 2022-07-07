package com.kaiware.moikredit.domain.markdown.usecase

import com.kaiware.moikredit.domain.markdown.dto.MarkdownResponseDto


interface MarkdownUseCaseFindByName {
    fun execute(name:String,lang:String): MarkdownResponseDto
}