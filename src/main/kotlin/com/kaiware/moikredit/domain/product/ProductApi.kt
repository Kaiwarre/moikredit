package com.kaiware.moikredit.domain.product

import com.kaiware.moikredit.ApiPath

class ProductApi {
    companion object{
        private const val protectedPath = "${ApiPath.protectedPath}/proposal"
        private const val publicPath = "${ApiPath.publicPath}/proposal"


        const val findById = "$publicPath/{id}"
        const val findByIdFull = "$protectedPath/full/{id}"
        const val findAllPaginated = "$publicPath/all/{pageNumber}/{pageSize}"

        const val save = protectedPath
        const val update = protectedPath
        const val deleteById = "$protectedPath/{id}"
    }
}