package com.kaiware.moikredit.domain.markdown.port.out.impl

import com.kaiware.moikredit._generic.port.out.crud.OutPortFindAllPaginated
import com.kaiware.moikredit.annotation.OutPort
import com.kaiware.moikredit.domain.markdown.Markdown
import com.kaiware.moikredit.domain.markdown.MarkdownRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort

@OutPort
class MarkdownOutPortFindAllPaginatedImpl(
    private val repository: MarkdownRepository
) : OutPortFindAllPaginated<Markdown> {
    override fun execute(pageNumber: Int, pageSize: Int): Page<Markdown> {
        val pageable = PageRequest.of(pageNumber,pageSize, Sort.unsorted())
        return repository.findAll(pageable)
    }
}