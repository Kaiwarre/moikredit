package com.kaiware.moikredit.domain.markdown.dto

import com.kaiware.moikredit._generic.data.UpdateDtoI
import com.kaiware.moikredit.domain.markdown.MarkdownData.MarkdownData


class MarkdownUpdateDto(
    var id:Long,
    var name: String,
    var dataList: List<MarkdownData>
) : UpdateDtoI {
}