package com.kaiware.moikredit.domain.product.port.`in`

import com.kaiware.moikredit._generic.port.`in`.crud.InPortDeleteById
import com.kaiware.moikredit._generic.usecase.UseCaseDeleteById
import com.kaiware.moikredit.annotation.InPort
import com.kaiware.moikredit.domain.product.Product
import com.kaiware.moikredit.domain.product.ProductApi
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PathVariable

@InPort
class ProductInPortDeleteByIdImpl(
    private val productUseCaseDeleteById: UseCaseDeleteById<Product,Long>
): InPortDeleteById<Product,Long> {
    @DeleteMapping(ProductApi.deleteById)
    override fun execute(@PathVariable id: Long): Any {
        productUseCaseDeleteById.execute(id)
        return ResponseEntity<Any>(HttpStatus.OK)
    }
}