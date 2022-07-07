package com.kaiware.moikredit.domain.proposal.usecase

import com.kaiware.moikredit._generic.port.out.crud.OutPortSave
import com.kaiware.moikredit._generic.usecase.abstract_impl.UseCaseSaveAbstractImpl
import com.kaiware.moikredit.annotation.UseCase
import com.kaiware.moikredit.domain.proposal.Proposal
import com.kaiware.moikredit.domain.proposal.dto.ProposalSaveDto

@UseCase
class ProposalUseCaseSaveImpl (
    override val outPortSave: OutPortSave<Proposal>
):UseCaseSaveAbstractImpl<Proposal, ProposalSaveDto>(){

    override fun execute(saveDto: ProposalSaveDto) {
        outPortSave.execute(
            Proposal(
                name=saveDto.name,
                email=saveDto.email,
                number=saveDto.number,
                checked=false,
            )
        )
    }


}