package com.kaiware.moikredit.domain.proposal.port.`in`.impl

import com.kaiware.moikredit._generic.port.`in`.crud.InPortFindAllPaginated
import com.kaiware.moikredit._generic.usecase.UseCaseFindAllPaginated
import com.kaiware.moikredit.annotation.InPort
import com.kaiware.moikredit.domain.proposal.ProposalApiPath
import com.kaiware.moikredit.domain.proposal.dto.ProposalResponseDto
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestHeader

@InPort
class ProposalInPortFindAllPaginatedImpl(
    private val useCaseFindAllPaginated: UseCaseFindAllPaginated<ProposalResponseDto>
): InPortFindAllPaginated {
    @GetMapping(ProposalApiPath.findAllPaginated)
    override fun execute(
        @PathVariable pageNumber: Int,
        @PathVariable pageSize: Int,
        @RequestHeader("Accept-Language") lang:String
    ): Any {
        return ResponseEntity(
useCaseFindAllPaginated.execute(pageNumber, pageSize,lang),
            HttpStatus.OK
        )
    }
}