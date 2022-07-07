package com.kaiware.moikredit.domain.product.dto

import com.kaiware.moikredit._generic.data.ResponseDtoI
import com.kaiware.moikredit._generic.util.Mapper
import com.kaiware.moikredit.domain.product.Product
import org.springframework.stereotype.Component
import javax.persistence.Column


class ProductResponseDto(
    var id: Long,
    var name:String,
    @Column(columnDefinition = "TEXT")
    var overview:String
): ResponseDtoI {

    @Component
    companion object: Mapper<Product, ProductResponseDto> {
        override fun toResponseDto(entity: Product, lang: String): ProductResponseDto {
            return ProductResponseDto(
                id=entity.id ?: 0,
                name = entity.dataByLanguage(lang).name,
                overview = entity.dataByLanguage(lang).overview
            )
        }

    }
}