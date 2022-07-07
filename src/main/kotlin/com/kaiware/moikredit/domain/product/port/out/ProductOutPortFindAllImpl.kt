package com.kaiware.moikredit.domain.product.port.out

import com.kaiware.moikredit._generic.port.out.crud.OutPortFindAll
import com.kaiware.moikredit.annotation.OutPort
import com.kaiware.moikredit.domain.product.Product
import com.kaiware.moikredit.domain.product.ProductRepository

@OutPort
class ProductOutPortFindAllImpl(
    private val productRepository: ProductRepository
):OutPortFindAll<Product> {
    override fun findAll(): List<Product> {
        return productRepository.findAll()
    }

}