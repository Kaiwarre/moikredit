package com.kaiware.moikredit.domain.product.usecase

import com.kaiware.moikredit._generic.port.out.crud.OutPortDeleteById
import com.kaiware.moikredit._generic.usecase.abstract_impl.UseCaseDeleteByIdAbstractImpl
import com.kaiware.moikredit.annotation.UseCase
import com.kaiware.moikredit.domain.product.Product

@UseCase
class ProductUseCaseDeleteByIdImpl(
    override val outPortDeleteById: OutPortDeleteById<Product,Long>
): UseCaseDeleteByIdAbstractImpl<Product,Long>()