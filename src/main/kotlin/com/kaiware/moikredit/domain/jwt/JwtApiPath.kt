package com.kaiware.moikredit.domain.jwt

import com.kaiware.moikredit.ApiPath


class JwtApiPath {
    companion object{
        private const val basePath = "/authenticate/{lang}"
        const val publicPath = "${ApiPath.publicPath}$basePath"

        const val generateJwtTokenPath = publicPath

    }
}