package com.kaiware.moikredit.domain.proposal.usecase

import com.kaiware.moikredit._generic.port.out.crud.OutPortFindById
import com.kaiware.moikredit._generic.usecase.abstract_find_impl.UseCaseFindByIdAbstractImpl
import com.kaiware.moikredit._generic.util.Mapper
import com.kaiware.moikredit.annotation.UseCase
import com.kaiware.moikredit.domain.proposal.Proposal
import com.kaiware.moikredit.domain.proposal.dto.ProposalResponseDto

@UseCase
class ProposalUseCaseFindByIdImpl (
    override val outPortFindById: OutPortFindById<Proposal, Long>,
    override val mapper: Mapper<Proposal, ProposalResponseDto>
        ): UseCaseFindByIdAbstractImpl<Proposal, Long, ProposalResponseDto>()