package com.kaiware.moikredit.domain.markdown.MarkdownData

import com.kaiware.moikredit._generic.data.EntityI
import javax.persistence.*

@Entity
class MarkdownData(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Long? = null,
    var lang:String,
    @Column(columnDefinition = "TEXT")
    var source:String = "no translation"
): EntityI {
}