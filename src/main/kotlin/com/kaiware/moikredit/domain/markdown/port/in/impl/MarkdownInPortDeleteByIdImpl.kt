package com.kaiware.moikredit.domain.markdown.port.`in`.impl

import com.kaiware.moikredit._generic.port.`in`.crud.InPortDeleteById
import com.kaiware.moikredit._generic.usecase.UseCaseDeleteById
import com.kaiware.moikredit.annotation.InPort
import com.kaiware.moikredit.domain.markdown.Markdown
import com.kaiware.moikredit.domain.markdown.MarkdownApi
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PathVariable


@InPort
class MarkdownInPortDeleteByIdImpl(
    private val markdownUseCaseDeleteById: UseCaseDeleteById<Markdown, Long>
) : InPortDeleteById<Markdown, Long> {
    @DeleteMapping(MarkdownApi.deleteById)
    override fun execute(@PathVariable id: Long): Any {
        markdownUseCaseDeleteById.execute(id)
        return ResponseEntity<Any>(HttpStatus.OK)
    }

}