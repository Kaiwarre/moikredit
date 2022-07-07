package com.kaiware.moikredit.domain.proposal.port.out.impl

import com.kaiware.moikredit._generic.port.out.crud.OutPortFindById
import com.kaiware.moikredit.annotation.OutPort
import com.kaiware.moikredit.domain.proposal.Proposal
import com.kaiware.moikredit.domain.proposal.ProposalRepository
import com.kaiware.moikredit.domain.user.User
import com.kaiware.moikredit.exception.ResourceNotFoundException

@OutPort
class ProposalOutPortFindByIdImpl(
    private val repository: ProposalRepository
): OutPortFindById<Proposal, Long> {
    override fun execute(id: Long): Proposal {
        return repository.findById(id).orElseThrow {
            ResourceNotFoundException(
                className = User::class.simpleName ?: "className",
                fieldName = User::id.name,
                fieldValue = id
            )
        }

    }
}