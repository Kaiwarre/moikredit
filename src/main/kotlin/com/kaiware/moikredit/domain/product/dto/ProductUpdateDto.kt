package com.kaiware.moikredit.domain.product.dto

import com.kaiware.moikredit._generic.data.UpdateDtoI
import com.kaiware.moikredit.domain.product.product_data.ProductData

class ProductUpdateDto(
    var id:Long,
    var name: String,
    var dataList: List<ProductData>
) : UpdateDtoI {
}