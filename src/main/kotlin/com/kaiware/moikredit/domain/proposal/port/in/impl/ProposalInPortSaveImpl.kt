package com.kaiware.moikredit.domain.proposal.port.`in`.impl

import com.kaiware.moikredit._generic.port.`in`.crud.abstract_impl.InPortSaveAbstractImpl
import com.kaiware.moikredit._generic.usecase.UseCaseSave
import com.kaiware.moikredit.annotation.InPort
import com.kaiware.moikredit.domain.proposal.Proposal
import com.kaiware.moikredit.domain.proposal.ProposalApiPath
import com.kaiware.moikredit.domain.proposal.dto.ProposalSaveDto
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@InPort
class ProposalInPortSaveImpl(
    override val useCaseInPortSave: UseCaseSave<ProposalSaveDto>
):InPortSaveAbstractImpl<Proposal,Long, ProposalSaveDto>() {
    @PostMapping(ProposalApiPath.savePath)
    override fun execute(@RequestBody saveDto: ProposalSaveDto):ResponseEntity<*> {
      useCaseInPortSave.execute(saveDto)
        return ResponseEntity<Any> (HttpStatus.CREATED)
    }

}