package com.kaiware.moikredit.domain.proposal.port.`in`.impl

import com.kaiware.moikredit._generic.port.`in`.crud.abstract_impl.InPortUpdateAbstractImpl
import com.kaiware.moikredit._generic.usecase.UseCaseUpdate
import com.kaiware.moikredit.annotation.InPort
import com.kaiware.moikredit.domain.proposal.Proposal
import com.kaiware.moikredit.domain.proposal.ProposalApiPath
import com.kaiware.moikredit.domain.proposal.dto.ProposalUpdateDto
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PutMapping

@InPort
class ProposalInPortUpdateImpl(
    override val useCaseUpdate: UseCaseUpdate<ProposalUpdateDto>
): InPortUpdateAbstractImpl<Proposal, Long, ProposalUpdateDto>() {
    @PutMapping(ProposalApiPath.updatePath)
    override fun execute(updateDto: ProposalUpdateDto): ResponseEntity<*> {
        useCaseUpdate.execute(updateDto)
        return ResponseEntity<Any>(HttpStatus.OK)
    }
}