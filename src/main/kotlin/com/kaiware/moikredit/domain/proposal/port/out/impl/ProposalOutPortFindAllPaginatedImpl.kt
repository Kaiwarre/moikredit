package com.kaiware.moikredit.domain.proposal.port.out.impl

import com.kaiware.moikredit._generic.port.out.crud.OutPortFindAllPaginated
import com.kaiware.moikredit.annotation.OutPort
import com.kaiware.moikredit.domain.proposal.Proposal
import com.kaiware.moikredit.domain.proposal.ProposalRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort

@OutPort
class ProposalOutPortFindAllPaginatedImpl(
    private val repository: ProposalRepository
): OutPortFindAllPaginated<Proposal> {
    override fun execute(pageNumber: Int, pageSize: Int): Page<Proposal> {
    val pageable = PageRequest.of(pageNumber,pageSize, Sort.unsorted())
    return repository.findAll(pageable)
}
}