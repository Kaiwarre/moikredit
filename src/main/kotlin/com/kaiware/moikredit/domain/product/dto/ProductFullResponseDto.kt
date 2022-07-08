package com.kaiware.moikredit.domain.product.dto

import com.kaiware.moikredit._generic.data.ResponseDtoI
import com.kaiware.moikredit._generic.util.Mapper
import com.kaiware.moikredit.domain.product.Product
import com.kaiware.moikredit.domain.product.product_data.ProductData
import org.springframework.stereotype.Component


class ProductFullResponseDto(
    var id:Long,
    var name:String,
    var dataList: List<ProductData> = emptyList(),
    var active:Boolean,
    var max_sum:Long,
    var min_sum:Long,
    var percent:Long,
    var max_duration:Long,
    var min_duration:Long,
) : ResponseDtoI {
    @Component
    companion object : Mapper<Product, ProductFullResponseDto> {
        override fun toResponseDto(entity: Product, lang: String): ProductFullResponseDto {
            return ProductFullResponseDto(
                id = entity.id ?: 0,
                name = entity.dataByLanguage(lang).name,
                active=entity.active,
                max_sum=entity.max_sum,
                min_sum=entity.min_sum,
                percent=entity.percent,
                max_duration =entity.max_duration,
                min_duration =entity.min_duration,
                dataList = entity.dataList
            )
        }

    }

}