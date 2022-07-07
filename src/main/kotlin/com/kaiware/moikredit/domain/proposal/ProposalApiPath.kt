package com.kaiware.moikredit.domain.proposal

import com.kaiware.moikredit.ApiPath

class ProposalApiPath{

    companion object{
        private const val basePath = "/proposal"
        private const val protectedPath = "${ApiPath.protectedPath}$basePath"
        private const val publicPath = "${ApiPath.publicPath}$basePath"
        
        const val findAllPaginated = "$protectedPath/all/{pageNumber}/{pageSize}"

        const val savePath = publicPath
        const val updatePath = protectedPath
        const val deleteByIdPath = "$protectedPath/{id}"
    }
}