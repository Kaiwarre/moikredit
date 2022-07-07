package com.kaiware.moikredit.domain.markdown.usecase.impl

import com.kaiware.moikredit._generic.port.out.crud.OutPortSave
import com.kaiware.moikredit._generic.usecase.abstract_impl.UseCaseSaveAbstractImpl
import com.kaiware.moikredit.annotation.UseCase
import com.kaiware.moikredit.domain.markdown.Markdown
import com.kaiware.moikredit.domain.markdown.dto.MarkdownSaveDto


@UseCase
class MarkdownUseCaseSaveImpl(
    override val outPortSave: OutPortSave<Markdown>
): UseCaseSaveAbstractImpl<Markdown, MarkdownSaveDto>() {

    override fun execute(saveDto: MarkdownSaveDto) {
        outPortSave.execute(
            Markdown(
                name = saveDto.name,
                dataList = saveDto.dataList
            )
        )
    }


}