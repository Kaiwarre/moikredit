package com.kaiware.moikredit.domain.proposal

import com.kaiware.moikredit._generic.data.EntityI
import javax.persistence.*

@Entity
class Proposal(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Long? = null,
    var name:String,
    var email:String,
    var number:String,
    var checked:Boolean,
    ) : EntityI {
}
