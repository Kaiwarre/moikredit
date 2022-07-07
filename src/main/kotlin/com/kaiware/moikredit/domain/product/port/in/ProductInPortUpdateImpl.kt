package com.kaiware.moikredit.domain.product.port.`in`

import com.kaiware.moikredit._generic.port.`in`.crud.InPortUpdate
import com.kaiware.moikredit._generic.usecase.UseCaseUpdate
import com.kaiware.moikredit.annotation.InPort
import com.kaiware.moikredit.domain.product.ProductApi
import com.kaiware.moikredit.domain.product.dto.ProductUpdateDto
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PutMapping

@InPort
class ProductInPortUpdateImpl(
    private val productUseCaseUpdate: UseCaseUpdate<ProductUpdateDto>
):InPortUpdate<ProductUpdateDto> {
    @PutMapping(ProductApi.update)
    override fun execute(updateDto: ProductUpdateDto): Any {
        productUseCaseUpdate.execute(updateDto)
        return ResponseEntity<Any>(HttpStatus.OK)
    }
}