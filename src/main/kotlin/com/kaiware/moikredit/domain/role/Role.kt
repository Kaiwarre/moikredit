package com.kaiware.moikredit.domain.role

import com.kaiware.moikredit._generic.data.EntityI
import com.kaiware.moikredit.domain.user.User
import javax.persistence.*

@Entity
class Role(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Long? = null,
    @Column(unique = true)
    var name:String,
    @ManyToMany(mappedBy = "roles",fetch = FetchType.LAZY, cascade = [CascadeType.REFRESH])
    var users:MutableSet<User> = mutableSetOf()
) : EntityI {
}