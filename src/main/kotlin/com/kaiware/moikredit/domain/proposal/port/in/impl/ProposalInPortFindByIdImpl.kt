package com.kaiware.moikredit.domain.proposal.port.`in`.impl

import com.kaiware.moikredit._generic.port.`in`.crud.abstract_impl.InPortFindByIdAbstractImpl
import com.kaiware.moikredit._generic.usecase.UseCaseFindById
import com.kaiware.moikredit.annotation.InPort
import com.kaiware.moikredit.domain.proposal.Proposal
import com.kaiware.moikredit.domain.proposal.ProposalApiPath
import com.kaiware.moikredit.domain.proposal.dto.ProposalResponseDto
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestHeader

@InPort
class ProposalInPortFindByIdImpl(
    override val useCaseFindById: UseCaseFindById<Proposal, Long, ProposalResponseDto>
): InPortFindByIdAbstractImpl<Proposal, Long, ProposalResponseDto>() {
    @GetMapping(ProposalApiPath.findByIdPath)
    override fun execute(@PathVariable id: Long, @RequestHeader("Accept-Language") lang: String): ResponseEntity<ProposalResponseDto> {
        return ResponseEntity(useCaseFindById.execute(id,lang), HttpStatus.OK)
    }
}