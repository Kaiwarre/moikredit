package com.kaiware.moikredit.domain.product.port.out

import com.kaiware.moikredit._generic.port.out.crud.OutPortDeleteById
import com.kaiware.moikredit.annotation.OutPort
import com.kaiware.moikredit.domain.product.Product
import com.kaiware.moikredit.domain.product.ProductRepository
import com.kaiware.moikredit.domain.proposal.Proposal
import com.kaiware.moikredit.exception.ResourceNotFoundException

@OutPort
class ProductOutPortDeleteByIdImpl(
    private val repository: ProductRepository
): OutPortDeleteById<Product, Long> {
    override fun execute(id: Long) {
        try{
            repository.deleteById(id)
        }catch(e:RuntimeException){
            throw ResourceNotFoundException(
                className = Product::class.simpleName ?: "className",
                fieldName = Product::id.name,
                fieldValue = id
            )
        }
    }
}