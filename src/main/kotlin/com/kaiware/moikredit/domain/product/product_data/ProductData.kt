package com.kaiware.moikredit.domain.product.product_data

import com.kaiware.moikredit._generic.data.EntityI
import javax.persistence.*

@Entity
class ProductData(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Long? = null,
    var name:String = "no translation",
    var lang:String,
    @Column(columnDefinition = "TEXT")
    var overview:String = "no translation"
): EntityI {
}