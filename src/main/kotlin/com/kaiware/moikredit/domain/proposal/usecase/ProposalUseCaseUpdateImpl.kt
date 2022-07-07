package com.kaiware.moikredit.domain.proposal.usecase

import com.kaiware.moikredit._generic.port.out.crud.OutPortFindById
import com.kaiware.moikredit._generic.port.out.crud.OutPortSave
import com.kaiware.moikredit._generic.usecase.abstract_impl.UseCaseUpdateAbstractImpl
import com.kaiware.moikredit.annotation.UseCase
import com.kaiware.moikredit.domain.proposal.Proposal
import com.kaiware.moikredit.domain.proposal.dto.ProposalUpdateDto

@UseCase
class ProposalUseCaseUpdateImpl(
    override val outPortSave: OutPortSave<Proposal>,
    override val outPortFindById: OutPortFindById<Proposal, Long>
): UseCaseUpdateAbstractImpl<Proposal,Long,ProposalUpdateDto>() {
    override fun execute(updateDto: ProposalUpdateDto) {
    val proposal = outPortFindById.execute(updateDto.id)
    proposal.checked=!proposal.checked
    outPortSave.execute(proposal)
}
}