package com.kaiware.moikredit.domain.proposal.port.out.impl

import com.kaiware.moikredit._generic.port.out.crud.OutPortSave
import com.kaiware.moikredit.annotation.OutPort
import com.kaiware.moikredit.domain.proposal.Proposal
import com.kaiware.moikredit.domain.proposal.ProposalRepository

@OutPort
class ProposalOutPortSaveImpl (
   private val repository: ProposalRepository,
):OutPortSave<Proposal>
{
    override fun execute(entity: Proposal) {
        repository.save(entity)
    }
}