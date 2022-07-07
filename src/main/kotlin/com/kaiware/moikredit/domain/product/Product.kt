package com.kaiware.moikredit.domain.product

import com.kaiware.moikredit._generic.data.EntityI
import com.kaiware.moikredit.domain.product.product_data.ProductData
import javax.persistence.*

@Entity
class Product(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Long? = null,

    var active:Boolean,
    var max_sum:Long,
    var min_sum:Long,
    var percent:Long,
    var max_duration:Long,
    var min_duration:Long,

    @OneToMany(cascade = [CascadeType.ALL])
    var dataList:List<ProductData> = emptyList(),
): EntityI {
    fun dataByLanguage(lang:String): ProductData {
        var productData = ProductData(lang = lang)
        dataList.find {
            it.lang == lang
        }?.let {
            productData=it
        }
        return productData
    }
}