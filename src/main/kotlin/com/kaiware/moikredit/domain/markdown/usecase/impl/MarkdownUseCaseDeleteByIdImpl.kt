package com.kaiware.moikredit.domain.markdown.usecase.impl
import com.kaiware.moikredit._generic.port.out.crud.OutPortDeleteById
import com.kaiware.moikredit._generic.usecase.abstract_impl.UseCaseDeleteByIdAbstractImpl
import com.kaiware.moikredit.annotation.UseCase
import com.kaiware.moikredit.domain.markdown.Markdown

@UseCase
class MarkdownUseCaseDeleteByIdImpl(
    override val outPortDeleteById: OutPortDeleteById<Markdown, Long>
) : UseCaseDeleteByIdAbstractImpl<Markdown, Long>(){
}