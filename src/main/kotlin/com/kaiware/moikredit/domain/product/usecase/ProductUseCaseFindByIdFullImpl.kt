package com.kaiware.moikredit.domain.product.usecase

import com.kaiware.moikredit._generic.port.out.crud.OutPortFindById
import com.kaiware.moikredit._generic.usecase.UseCaseFindByIdFull
import com.kaiware.moikredit.annotation.UseCase
import com.kaiware.moikredit.domain.product.Product
import com.kaiware.moikredit.domain.product.dto.ProductFullResponseDto

@UseCase
class ProductUseCaseFindByIdFullImpl(
    private val outPortFindById: OutPortFindById<Product,Long>
): UseCaseFindByIdFull<ProductFullResponseDto,Long> {
    override fun execute(id: Long): ProductFullResponseDto {
        return ProductFullResponseDto.toResponseDto(outPortFindById.execute(id))
    }
}