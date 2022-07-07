package com.kaiware.moikredit.domain.product.usecase

import com.kaiware.moikredit._generic.port.out.crud.OutPortSave
import com.kaiware.moikredit._generic.usecase.abstract_impl.UseCaseSaveAbstractImpl
import com.kaiware.moikredit.annotation.UseCase
import com.kaiware.moikredit.domain.product.Product
import com.kaiware.moikredit.domain.product.dto.ProductSaveDto

@UseCase
class ProductUseCaseSaveImpl(
    override val outPortSave: OutPortSave<Product>
): UseCaseSaveAbstractImpl<Product, ProductSaveDto>(){
    override fun execute(saveDto: ProductSaveDto) {
        outPortSave.execute(
            Product(
                active=false,
                max_sum=saveDto.max_sum,
                min_sum=saveDto.min_sum,
                percent=saveDto.percent,
                max_duration=saveDto.max_duration,
                min_duration=saveDto.min_duration,
                dataList = saveDto.dataList
            )
        )
    }
}