package com.kaiware.moikredit.domain.markdown.usecase.impl

import com.kaiware.moikredit._generic.port.out.crud.OutPortFindById
import com.kaiware.moikredit._generic.usecase.UseCaseFindByIdFull
import com.kaiware.moikredit.annotation.UseCase
import com.kaiware.moikredit.domain.markdown.Markdown
import com.kaiware.moikredit.domain.markdown.dto.MarkdownFullResponseDto

@UseCase
class MarkdownUseCaseFindByIdFullImpl(
    private val outPortFindById: OutPortFindById<Markdown, Long>
): UseCaseFindByIdFull<MarkdownFullResponseDto, Long> {
    override fun execute(id: Long): MarkdownFullResponseDto {
        return MarkdownFullResponseDto.toResponseDto(outPortFindById.execute(id))
    }
}