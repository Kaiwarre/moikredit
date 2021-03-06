package com.kaiware.moikredit.domain.proposal

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface ProposalRepository: JpaRepository<Proposal, Long> {

}