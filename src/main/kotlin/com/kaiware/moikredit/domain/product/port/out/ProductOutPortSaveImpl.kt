package com.kaiware.moikredit.domain.product.port.out

import com.kaiware.moikredit._generic.port.out.crud.OutPortSave
import com.kaiware.moikredit.annotation.OutPort
import com.kaiware.moikredit.domain.product.Product
import com.kaiware.moikredit.domain.product.ProductRepository

@OutPort
class ProductOutPortSaveImpl(
    private val repository: ProductRepository,
): OutPortSave<Product> {
    override fun execute(entity: Product) {
        repository.save(entity)
    }}