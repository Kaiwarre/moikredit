package com.kaiware.moikredit.domain.user

import com.kaiware.moikredit.ApiPath


class UserApiPath {

    companion object{
        private const val basePath = "/user"
        const val protectedPath = "${ApiPath.protectedPath}$basePath"
        const val publicPath = "${ApiPath.publicPath}$basePath"

        const val findByIdPath = "$publicPath/{id}"
        const val findAllPath = "$publicPath/all"

        const val savePath = "$publicPath/register"
        const val updatePath = protectedPath
        const val deleteByIdPath = "$protectedPath/{id}"
    }
}