package com.kaiware.moikredit.domain.user.dto

import com.kaiware.moikredit._generic.data.UpdateDtoI


class UserUpdateDto(
    var id: Long,
    var name: String
) : UpdateDtoI

