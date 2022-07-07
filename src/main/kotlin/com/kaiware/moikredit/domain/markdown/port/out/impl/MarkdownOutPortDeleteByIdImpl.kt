package com.kaiware.moikredit.domain.markdown.port.out.impl

import com.kaiware.moikredit._generic.port.out.crud.OutPortDeleteById
import com.kaiware.moikredit.annotation.OutPort
import com.kaiware.moikredit.domain.markdown.Markdown
import com.kaiware.moikredit.domain.markdown.MarkdownRepository
import com.kaiware.moikredit.exception.ResourceNotFoundException


@OutPort
class MarkdownOutPortDeleteByIdImpl(
    private val repository: MarkdownRepository
) : OutPortDeleteById<Markdown, Long> {
    override fun execute(id: Long) {
        try{
            repository.deleteById(id)
        }catch(e:Exception){
            throw ResourceNotFoundException(
                className = "Markdown",
                fieldName = "Id",
                fieldValue = id
            )
        }

    }
}