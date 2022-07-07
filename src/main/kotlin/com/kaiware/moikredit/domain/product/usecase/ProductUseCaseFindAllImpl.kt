package com.kaiware.moikredit.domain.product.usecase

import com.kaiware.moikredit._generic.port.out.crud.OutPortFindAll
import com.kaiware.moikredit._generic.usecase.UseCaseFindAll
import com.kaiware.moikredit._generic.usecase.abstract_find_impl.UseCaseFindAllAbstractImpl
import com.kaiware.moikredit._generic.util.Mapper
import com.kaiware.moikredit.annotation.UseCase
import com.kaiware.moikredit.domain.product.Product
import com.kaiware.moikredit.domain.product.dto.ProductResponseDto

@UseCase
class ProductUseCaseFindAllImpl(
    override val outPortFindAll: OutPortFindAll<Product>,
    override val mapper: Mapper<Product, ProductResponseDto>
):UseCaseFindAllAbstractImpl<Product,ProductResponseDto>() {
}