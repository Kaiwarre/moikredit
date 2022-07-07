package com.kaiware.moikredit.domain.product.port.out

import com.kaiware.moikredit._generic.port.out.crud.OutPortFindById
import com.kaiware.moikredit.annotation.OutPort
import com.kaiware.moikredit.domain.markdown.Markdown
import com.kaiware.moikredit.domain.product.Product
import com.kaiware.moikredit.domain.product.ProductRepository
import com.kaiware.moikredit.exception.ResourceNotFoundException

@OutPort
class ProductOutPortFindByIdImpl(
    private val repository: ProductRepository
): OutPortFindById<Product,Long> {
    override fun execute(id: Long): Product {
        return repository.findById(id).orElseThrow {
            ResourceNotFoundException(
                className = "Product",
                fieldName = "id",
                fieldValue = id
            )
        }
    }
}