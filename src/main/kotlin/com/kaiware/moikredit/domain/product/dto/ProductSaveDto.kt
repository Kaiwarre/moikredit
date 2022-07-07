package com.kaiware.moikredit.domain.product.dto

import com.kaiware.moikredit._generic.data.EntityI
import com.kaiware.moikredit._generic.data.SaveDtoI
import com.kaiware.moikredit.domain.product.product_data.ProductData


class ProductSaveDto(
    var max_sum:Long,
    var min_sum:Long,
    var percent:Long,
    var max_duration:Long,
    var min_duration:Long,
    var dataList:List<ProductData>,
): SaveDtoI {
}