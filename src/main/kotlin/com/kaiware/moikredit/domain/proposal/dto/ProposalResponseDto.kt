package com.kaiware.moikredit.domain.proposal.dto

import com.kaiware.moikredit._generic.data.ResponseDtoI
import com.kaiware.moikredit._generic.util.Mapper
import com.kaiware.moikredit.domain.proposal.Proposal
import org.springframework.stereotype.Component

class ProposalResponseDto(
    var id:Long? = null,
    var name:String,
    var number:String,
    var email:String,
    var checked:Boolean,
):ResponseDtoI {
    @Component
    companion object: Mapper<Proposal, ProposalResponseDto> {
        override fun toResponseDto(entity: Proposal, lang:String): ProposalResponseDto {
            return ProposalResponseDto(
                id = entity.id,
                email = entity.email,
                name = entity.name,
                number=entity.number,
                checked=entity.checked
            )
        }
    }
}