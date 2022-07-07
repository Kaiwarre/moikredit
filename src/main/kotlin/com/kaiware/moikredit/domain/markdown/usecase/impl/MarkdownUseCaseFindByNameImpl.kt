package com.kaiware.moikredit.domain.markdown.usecase.impl

import com.kaiware.moikredit.annotation.UseCase
import com.kaiware.moikredit.domain.markdown.dto.MarkdownResponseDto
import com.kaiware.moikredit.domain.markdown.port.out.MarkdownOutPortFindByName
import com.kaiware.moikredit.domain.markdown.usecase.MarkdownUseCaseFindByName


@UseCase
class MarkdownUseCaseFindByNameImpl(
    private val markdownOutPortFindByName: MarkdownOutPortFindByName
) : MarkdownUseCaseFindByName {
    override fun execute(name: String, lang: String): MarkdownResponseDto {
        return MarkdownResponseDto.toResponseDto(
            markdownOutPortFindByName.execute(name),
            lang,
        )
    }
}