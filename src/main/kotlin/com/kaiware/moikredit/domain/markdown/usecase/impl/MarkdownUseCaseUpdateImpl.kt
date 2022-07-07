package com.kaiware.moikredit.domain.markdown.usecase.impl

import com.kaiware.moikredit._generic.port.out.crud.OutPortFindById
import com.kaiware.moikredit._generic.port.out.crud.OutPortSave
import com.kaiware.moikredit._generic.usecase.UseCaseUpdate
import com.kaiware.moikredit.annotation.UseCase
import com.kaiware.moikredit.domain.markdown.Markdown
import com.kaiware.moikredit.domain.markdown.dto.MarkdownUpdateDto


@UseCase
class MarkdownUseCaseUpdateImpl(
    private val markdownOutPortFindById: OutPortFindById<Markdown, Long>,
    private val markdownOutPortSave: OutPortSave<Markdown>
) : UseCaseUpdate<MarkdownUpdateDto> {
    override fun execute(updateDto: MarkdownUpdateDto) {
        val markdown = markdownOutPortFindById.execute(updateDto.id)
        markdown.name = updateDto.name
        markdown.dataList=updateDto.dataList
        markdownOutPortSave.execute(markdown)
    }
}