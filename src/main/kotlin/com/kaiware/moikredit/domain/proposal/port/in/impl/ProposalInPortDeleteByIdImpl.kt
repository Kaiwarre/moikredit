package com.kaiware.moikredit.domain.proposal.port.`in`.impl

import com.kaiware.moikredit._generic.port.`in`.crud.abstract_impl.InPortDeleteByIdAbstractImpl
import com.kaiware.moikredit._generic.usecase.UseCaseDeleteById
import com.kaiware.moikredit.annotation.InPort
import com.kaiware.moikredit.domain.proposal.Proposal
import com.kaiware.moikredit.domain.proposal.ProposalApiPath
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PathVariable

@InPort
class ProposalInPortDeleteByIdImpl(
    override val useCaseDeleteById: UseCaseDeleteById<Proposal, Long>
) : InPortDeleteByIdAbstractImpl<Proposal, Long>() {
    @PreAuthorize("hasAnyRole('Admin','Moderator')")
    @DeleteMapping(ProposalApiPath.deleteByIdPath)
    override fun execute(@PathVariable id: Long): ResponseEntity<*> {
        useCaseDeleteById.execute(id)
        return ResponseEntity<Any>(HttpStatus.OK)
    }
}