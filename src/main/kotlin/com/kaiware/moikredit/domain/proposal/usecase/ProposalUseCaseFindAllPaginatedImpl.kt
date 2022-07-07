package com.kaiware.moikredit.domain.proposal.usecase

import com.kaiware.moikredit._generic.port.out.crud.OutPortFindAllPaginated
import com.kaiware.moikredit._generic.usecase.abstract_find_impl.UseCaseFindAllPaginatedAbstractImpl
import com.kaiware.moikredit._generic.util.Mapper
import com.kaiware.moikredit.annotation.UseCase
import com.kaiware.moikredit.domain.proposal.Proposal
import com.kaiware.moikredit.domain.proposal.dto.ProposalResponseDto

@UseCase
class ProposalUseCaseFindAllPaginatedImpl(
    override val outPortFindAllPaginated: OutPortFindAllPaginated<Proposal>,
    override val mapper: Mapper<Proposal, ProposalResponseDto>
): UseCaseFindAllPaginatedAbstractImpl<Proposal, ProposalResponseDto>() {

}