package com.kaiware.moikredit.domain.markdown.port.`in`.impl

import com.kaiware.moikredit._generic.port.`in`.crud.InPortFindAllPaginated
import com.kaiware.moikredit._generic.usecase.UseCaseFindAllPaginated
import com.kaiware.moikredit.annotation.InPort
import com.kaiware.moikredit.domain.markdown.MarkdownApi
import com.kaiware.moikredit.domain.markdown.dto.MarkdownResponseDto
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestHeader

@InPort
class MarkdownInPortFindAllPaginated(
    private val markdownUseCaseFindAllPaginated: UseCaseFindAllPaginated<MarkdownResponseDto>
): InPortFindAllPaginated {

    @GetMapping(MarkdownApi.findAllPaginated)
    override fun execute(
        @PathVariable pageNumber: Int,
        @PathVariable pageSize: Int,
        @RequestHeader("Accept-Language") lang: String
    ): Any {
        return ResponseEntity(
            markdownUseCaseFindAllPaginated.execute(pageNumber,pageSize, lang),
            HttpStatus.OK
        )
    }


}