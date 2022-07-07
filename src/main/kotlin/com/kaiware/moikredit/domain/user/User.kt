package com.kaiware.moikredit.domain.user

import com.kaiware.moikredit._generic.data.EntityI
import com.kaiware.moikredit.domain.role.Role
import javax.persistence.*


@Entity
class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Long? = null,
    var name:String,
    @Column(unique = true)
    var email:String,
    var password:String,
    @ManyToMany(fetch = FetchType.EAGER, cascade = [CascadeType.REFRESH])
    var roles:MutableSet<Role> = mutableSetOf()
): EntityI {

}