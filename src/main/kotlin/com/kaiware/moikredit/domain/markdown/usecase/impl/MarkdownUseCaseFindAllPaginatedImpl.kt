package com.kaiware.moikredit.domain.markdown.usecase.impl

import com.kaiware.moikredit._generic.port.out.crud.OutPortFindAllPaginated
import com.kaiware.moikredit._generic.usecase.abstract_find_impl.UseCaseFindAllPaginatedAbstractImpl
import com.kaiware.moikredit._generic.util.Mapper
import com.kaiware.moikredit.annotation.UseCase
import com.kaiware.moikredit.domain.markdown.Markdown
import com.kaiware.moikredit.domain.markdown.dto.MarkdownResponseDto


@UseCase
class MarkdownUseCaseFindAllPaginatedImpl(
    override val outPortFindAllPaginated: OutPortFindAllPaginated<Markdown>,
    override val mapper: Mapper<Markdown, MarkdownResponseDto>
) : UseCaseFindAllPaginatedAbstractImpl<Markdown, MarkdownResponseDto>(){
}