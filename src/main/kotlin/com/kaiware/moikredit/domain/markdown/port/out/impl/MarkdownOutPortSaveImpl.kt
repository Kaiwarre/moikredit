package com.kaiware.moikredit.domain.markdown.port.out.impl

import com.kaiware.moikredit._generic.port.out.crud.OutPortSave
import com.kaiware.moikredit.annotation.OutPort
import com.kaiware.moikredit.domain.markdown.Markdown
import com.kaiware.moikredit.domain.markdown.MarkdownRepository


@OutPort
class MarkdownOutPortSaveImpl(
    private val repository: MarkdownRepository
) : OutPortSave<Markdown> {
    override fun execute(entity: Markdown) {
        repository.save(entity)
    }
}