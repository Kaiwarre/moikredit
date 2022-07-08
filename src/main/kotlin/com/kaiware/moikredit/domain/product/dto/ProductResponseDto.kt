package com.kaiware.moikredit.domain.product.dto

import com.kaiware.moikredit._generic.data.ResponseDtoI
import com.kaiware.moikredit._generic.util.Mapper
import com.kaiware.moikredit.domain.product.Product
import org.springframework.stereotype.Component
import javax.persistence.Column


class ProductResponseDto(
    var id: Long,
    var name:String,
    var overview:String,
    var active:Boolean,
    var max_sum:Long,
    var min_sum:Long,
    var percent:Long,
    var max_duration:Long,
    var min_duration:Long,
): ResponseDtoI {

    @Component
    companion object: Mapper<Product, ProductResponseDto> {
        override fun toResponseDto(entity: Product, lang: String): ProductResponseDto {
            return ProductResponseDto(
                id=entity.id ?: 0,
                active=entity.active,
                max_sum=entity.max_sum,
                min_sum=entity.min_sum,
                percent=entity.percent,
                max_duration =entity.max_duration,
                min_duration =entity.min_duration,
                name = entity.dataByLanguage(lang).name,
                overview = entity.dataByLanguage(lang).overview
            )
        }

    }
}