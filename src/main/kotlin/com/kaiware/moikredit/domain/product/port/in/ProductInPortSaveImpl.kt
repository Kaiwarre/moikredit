package com.kaiware.moikredit.domain.product.port.`in`

import com.kaiware.moikredit._generic.port.`in`.crud.InPortSave
import com.kaiware.moikredit._generic.usecase.UseCaseSave
import com.kaiware.moikredit.annotation.InPort
import com.kaiware.moikredit.domain.product.ProductApi
import com.kaiware.moikredit.domain.product.dto.ProductSaveDto
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@InPort
class ProductInPortSaveImp(
    private val ProductUseCaseSave: UseCaseSave<ProductSaveDto>
): InPortSave<ProductSaveDto> {
    @PostMapping(ProductApi.save)
    override fun execute(@RequestBody saveDto: ProductSaveDto): Any {
        ProductUseCaseSave.execute(saveDto)
        return ResponseEntity<Any>(HttpStatus.OK)
    }
}