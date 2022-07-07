package com.kaiware.moikredit.domain.product.usecase

import com.kaiware.moikredit._generic.port.out.crud.OutPortFindById
import com.kaiware.moikredit._generic.port.out.crud.OutPortSave
import com.kaiware.moikredit._generic.usecase.UseCaseUpdate
import com.kaiware.moikredit.annotation.UseCase
import com.kaiware.moikredit.domain.markdown.dto.MarkdownUpdateDto
import com.kaiware.moikredit.domain.product.Product
import com.kaiware.moikredit.domain.product.dto.ProductUpdateDto

@UseCase
class ProductUseCaseUpdateImp(
    private val productOutPortFindById:OutPortFindById<Product,Long>,
    private val productOutPortSave: OutPortSave<Product>
): UseCaseUpdate<ProductUpdateDto> {
    override fun execute(updateDto: ProductUpdateDto) {
        val product = productOutPortFindById.execute(updateDto.id)
        product.active=updateDto.active
        product.max_sum=updateDto.max_sum
        product.min_sum=updateDto.min_sum
        product.percent=updateDto.percent
        product.max_duration=updateDto.max_duration
        product.min_duration=updateDto.min_duration
        product.dataList=updateDto.dataList
        productOutPortSave.execute(product)
    }
}