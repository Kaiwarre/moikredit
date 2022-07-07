package com.kaiware.moikredit.domain.product.port.out

import com.kaiware.moikredit._generic.port.out.crud.OutPortFindAllPaginated
import com.kaiware.moikredit.annotation.OutPort
import com.kaiware.moikredit.domain.markdown.Markdown
import com.kaiware.moikredit.domain.product.Product
import com.kaiware.moikredit.domain.product.ProductRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort

@OutPort
class ProductOutPortFindAllPaginatedImpl(
    private val repository: ProductRepository
): OutPortFindAllPaginated<Product> {
    override fun execute(pageNumber: Int, pageSize: Int): Page<Product> {
        val pageable = PageRequest.of(pageNumber,pageSize, Sort.unsorted())
        return repository.findAll(pageable)
    }
}