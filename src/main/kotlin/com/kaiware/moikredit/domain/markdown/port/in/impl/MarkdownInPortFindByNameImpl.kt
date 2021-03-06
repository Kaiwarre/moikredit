package com.kaiware.moikredit.domain.markdown.port.`in`.impl

import com.kaiware.moikredit.annotation.InPort
import com.kaiware.moikredit.domain.markdown.MarkdownApi
import com.kaiware.moikredit.domain.markdown.MarkdownInPortFindByName
import com.kaiware.moikredit.domain.markdown.usecase.MarkdownUseCaseFindByName
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestHeader

@InPort
class MarkdownInPortFindByNameImpl(
    private val markdownUseCaseFindByName: MarkdownUseCaseFindByName
) : MarkdownInPortFindByName {
    @GetMapping(MarkdownApi.findByName)
    override fun execute(
        @PathVariable name: String,
        @RequestHeader("Accept-Language") lang: String
    ): Any {
        return ResponseEntity(
            markdownUseCaseFindByName.execute(name,lang),
            HttpStatus.OK
        )
    }
}