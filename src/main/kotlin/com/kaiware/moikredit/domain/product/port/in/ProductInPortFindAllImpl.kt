package com.kaiware.moikredit.domain.product.port.`in`

import com.kaiware.moikredit._generic.port.`in`.crud.abstract_impl.InPortFindAllAbstractImpl
import com.kaiware.moikredit._generic.usecase.UseCaseFindAll
import com.kaiware.moikredit.annotation.InPort
import com.kaiware.moikredit.domain.product.Product
import com.kaiware.moikredit.domain.product.ProductApi
import com.kaiware.moikredit.domain.product.dto.ProductResponseDto
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestHeader

@InPort
class ProductInPortFindAllImpl(
    override val useCaseFindAll: UseCaseFindAll<Product, ProductResponseDto>
):InPortFindAllAbstractImpl<Product,ProductResponseDto>() {
    @GetMapping(ProductApi.findAll)

    override fun execute( @RequestHeader("Accept-Language") lang: String
    ): Any {
        return ResponseEntity(
            useCaseFindAll.execute(lang),
            HttpStatus.OK
        )
    }
}