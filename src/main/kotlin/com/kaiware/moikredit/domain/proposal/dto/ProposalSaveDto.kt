package com.kaiware.moikredit.domain.proposal.dto

import com.kaiware.moikredit._generic.data.SaveDtoI

class ProposalSaveDto (
   var name:String,
   var email:String,
   var number:String,   
):SaveDtoI{
}