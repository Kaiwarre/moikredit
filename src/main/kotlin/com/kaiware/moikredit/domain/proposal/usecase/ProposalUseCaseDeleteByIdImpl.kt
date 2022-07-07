package com.kaiware.moikredit.domain.proposal.usecase

import com.kaiware.moikredit._generic.port.out.crud.OutPortDeleteById
import com.kaiware.moikredit._generic.usecase.abstract_impl.UseCaseDeleteByIdAbstractImpl
import com.kaiware.moikredit.annotation.UseCase
import com.kaiware.moikredit.domain.proposal.Proposal

@UseCase
class ProposalUseCaseDeleteByIdImpl(
    override val outPortDeleteById: OutPortDeleteById<Proposal, Long>
): UseCaseDeleteByIdAbstractImpl<Proposal, Long>()