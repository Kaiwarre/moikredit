package com.kaiware.moikredit.domain.markdown.port.`in`.impl

import com.kaiware.moikredit._generic.port.`in`.crud.abstract_impl.InPortFindByIdFullAbstractImpl
import com.kaiware.moikredit._generic.usecase.UseCaseFindByIdFull
import com.kaiware.moikredit.annotation.InPort
import com.kaiware.moikredit.domain.markdown.MarkdownApi
import com.kaiware.moikredit.domain.markdown.dto.MarkdownFullResponseDto
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@InPort
class MarkdownInPortFindByIdFullImpl(
    override val useCaseFindByIdFull: UseCaseFindByIdFull<MarkdownFullResponseDto, Long>
): InPortFindByIdFullAbstractImpl<Long, MarkdownFullResponseDto>() {
    @GetMapping(MarkdownApi.findByIdFull)
    override fun execute(@PathVariable id: Long): Any {
        return ResponseEntity(useCaseFindByIdFull.execute(id), HttpStatus.OK)
    }
}