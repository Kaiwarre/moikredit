package com.kaiware.moikredit.domain.product.port.`in`

import com.kaiware.moikredit._generic.port.`in`.crud.InPortFindAllPaginated
import com.kaiware.moikredit._generic.usecase.UseCaseFindAllPaginated
import com.kaiware.moikredit.domain.product.ProductApi
import com.kaiware.moikredit.domain.product.dto.ProductResponseDto
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestHeader

class ProductInPortFindAllPaginatedImpl(
    private val productUseCaseFindAllPaginated: UseCaseFindAllPaginated<ProductResponseDto>
): InPortFindAllPaginated {
    @GetMapping(ProductApi.findAllPaginated)
    override fun execute(
        @PathVariable pageNumber: Int,
        @PathVariable pageSize: Int,
        @RequestHeader("Accept-Language") lang: String
    ): Any {
        return ResponseEntity(
            productUseCaseFindAllPaginated.execute(pageNumber,pageSize, lang),
            HttpStatus.OK
        )
    }
}