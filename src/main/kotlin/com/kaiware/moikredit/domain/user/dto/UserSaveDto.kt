package com.kaiware.moikredit.domain.user.dto

import com.kaiware.moikredit._generic.data.SaveDtoI


class UserSaveDto(
    var name:String,
    var email:String,
    var password:String
) : SaveDtoI

