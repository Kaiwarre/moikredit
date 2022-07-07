package com.kaiware.moikredit.domain.markdown.port.out.impl

import com.kaiware.moikredit._generic.port.out.crud.OutPortFindById
import com.kaiware.moikredit.annotation.OutPort
import com.kaiware.moikredit.domain.markdown.Markdown
import com.kaiware.moikredit.domain.markdown.MarkdownRepository
import com.kaiware.moikredit.exception.ResourceNotFoundException

@OutPort
class MarkdownOutPortFindByIdImpl(
    private val repository: MarkdownRepository
) : OutPortFindById<Markdown, Long> {
    override fun execute(id: Long): Markdown {
        return repository.findById(id).orElseThrow {
            ResourceNotFoundException(
                className = "Markdown",
                fieldName = "id",
                fieldValue = id
            )
        }
    }
}