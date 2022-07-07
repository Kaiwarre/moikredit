package com.kaiware.moikredit.domain.proposal.port.out.impl

import com.kaiware.moikredit._generic.port.out.crud.OutPortDeleteById
import com.kaiware.moikredit.annotation.OutPort
import com.kaiware.moikredit.domain.proposal.Proposal
import com.kaiware.moikredit.domain.proposal.ProposalRepository
import com.kaiware.moikredit.exception.ResourceNotFoundException

@OutPort
class ProposalOutPortDeleteByIdImpl(
    private val repository: ProposalRepository
): OutPortDeleteById<Proposal, Long> {
    override fun execute(id: Long) {
        try{
            repository.deleteById(id)
        }catch(e:RuntimeException){
            throw ResourceNotFoundException(
                className = Proposal::class.simpleName ?: "className",
                fieldName = Proposal::id.name,
                fieldValue = id
            )
        }
    }
}