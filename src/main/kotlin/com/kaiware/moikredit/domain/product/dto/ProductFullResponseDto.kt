package com.kaiware.moikredit.domain.product.dto

import com.kaiware.moikredit._generic.data.ResponseDtoI
import com.kaiware.moikredit._generic.util.Mapper
import com.kaiware.moikredit.domain.product.Product
import com.kaiware.moikredit.domain.product.product_data.ProductData
import org.springframework.stereotype.Component


class ProductFullResponseDto(
    var id:Long,
    var name:String,
    var dataList: List<ProductData> = emptyList()
) : ResponseDtoI {
    @Component
    companion object : Mapper<Product, ProductFullResponseDto> {
        override fun toResponseDto(entity: Product, lang: String): ProductFullResponseDto {
            return ProductFullResponseDto(
                id = entity.id ?: 0,
                name = entity.dataByLanguage(lang).name,
                dataList = entity.dataList
            )
        }

    }

}