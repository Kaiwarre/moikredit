package com.kaiware.moikredit.domain.markdown.port.`in`.impl

import com.kaiware.moikredit._generic.port.`in`.crud.InPortSave
import com.kaiware.moikredit._generic.usecase.UseCaseSave
import com.kaiware.moikredit.annotation.InPort
import com.kaiware.moikredit.domain.markdown.MarkdownApi
import com.kaiware.moikredit.domain.markdown.dto.MarkdownSaveDto
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody


@InPort
class MarkdownInPortSaveImpl(
   private val markdownUseCaseSave: UseCaseSave<MarkdownSaveDto>
) : InPortSave<MarkdownSaveDto> {

    @PostMapping(MarkdownApi.save)
    override fun execute(@RequestBody saveDto: MarkdownSaveDto): Any {
        markdownUseCaseSave.execute(saveDto)
        return ResponseEntity<Any>(HttpStatus.OK)
    }

}