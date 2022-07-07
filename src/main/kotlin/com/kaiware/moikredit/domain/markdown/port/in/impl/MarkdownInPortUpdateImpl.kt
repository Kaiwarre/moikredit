package com.kaiware.moikredit.domain.markdown.port.`in`.impl

import com.kaiware.moikredit._generic.port.`in`.crud.InPortUpdate
import com.kaiware.moikredit._generic.usecase.UseCaseUpdate
import com.kaiware.moikredit.annotation.InPort
import com.kaiware.moikredit.domain.markdown.MarkdownApi
import com.kaiware.moikredit.domain.markdown.dto.MarkdownUpdateDto
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PutMapping


@InPort
class MarkdownInPortUpdateImpl(
    private val markdownUseCaseUpdate: UseCaseUpdate<MarkdownUpdateDto>
) : InPortUpdate<MarkdownUpdateDto> {

    @PutMapping(MarkdownApi.update)
    override fun execute(updateDto: MarkdownUpdateDto): Any {
        markdownUseCaseUpdate.execute(updateDto)
        return ResponseEntity<Any>(HttpStatus.OK)
    }
}