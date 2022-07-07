package com.kaiware.moikredit.domain.markdown.port.out.impl

import com.kaiware.moikredit.annotation.OutPort
import com.kaiware.moikredit.domain.markdown.Markdown
import com.kaiware.moikredit.domain.markdown.port.out.MarkdownOutPortFindByName
import com.kaiware.moikredit.domain.markdown.MarkdownRepository
import com.kaiware.moikredit.exception.ResourceNotFoundException


@OutPort
class MarkdownOutPortFindByNameImpl(
    private val repository: MarkdownRepository
) : MarkdownOutPortFindByName {
    override fun execute(name: String): Markdown {
        repository.findByName(name)?.let {markdown ->
            return markdown
        }
        throw ResourceNotFoundException(
            className = "Markdown",
            fieldName = "name",
            fieldValue = name
        )
    }
}