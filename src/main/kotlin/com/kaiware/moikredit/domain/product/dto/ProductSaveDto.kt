package com.kaiware.moikredit.domain.product.dto

import com.kaiware.moikredit._generic.data.EntityI
import com.kaiware.moikredit.domain.product.product_data.ProductData


class ProductSaveDto(
    var name: String,
    var dataList:List<ProductData>
): EntityI {
}