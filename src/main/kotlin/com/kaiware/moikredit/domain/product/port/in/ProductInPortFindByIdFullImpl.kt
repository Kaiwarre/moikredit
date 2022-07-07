package com.kaiware.moikredit.domain.product.port.`in`

import com.kaiware.moikredit._generic.port.`in`.crud.abstract_impl.InPortFindByIdFullAbstractImpl
import com.kaiware.moikredit._generic.usecase.UseCaseFindByIdFull
import com.kaiware.moikredit.annotation.InPort
import com.kaiware.moikredit.domain.product.ProductApi
import com.kaiware.moikredit.domain.product.dto.ProductFullResponseDto
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@InPort
class ProductInPortFindByIdFullImpl(
    override val useCaseFindByIdFull: UseCaseFindByIdFull<ProductFullResponseDto, Long>
): InPortFindByIdFullAbstractImpl<Long,ProductFullResponseDto>() {
    @GetMapping(ProductApi.findByIdFull)
    override fun execute(@PathVariable id: Long): Any {
        return ResponseEntity(useCaseFindByIdFull.execute(id), HttpStatus.OK)
    }
}