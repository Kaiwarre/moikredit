package com.kaiware.moikredit.domain.product.usecase

import com.kaiware.moikredit._generic.port.out.crud.OutPortFindAllPaginated
import com.kaiware.moikredit._generic.usecase.abstract_find_impl.UseCaseFindAllPaginatedAbstractImpl
import com.kaiware.moikredit._generic.util.Mapper
import com.kaiware.moikredit.domain.product.Product
import com.kaiware.moikredit.domain.product.dto.ProductResponseDto

class ProductUseCaseFindAllPaginatedImpl(
    override val outPortFindAllPaginated: OutPortFindAllPaginated<Product>,
    override val mapper: Mapper<Product, ProductResponseDto>
): UseCaseFindAllPaginatedAbstractImpl<Product,ProductResponseDto>() {
}