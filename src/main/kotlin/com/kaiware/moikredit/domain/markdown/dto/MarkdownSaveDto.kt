package com.kaiware.moikredit.domain.markdown.dto

import com.kaiware.moikredit._generic.data.SaveDtoI
import com.kaiware.moikredit.domain.markdown.MarkdownData.MarkdownData


class MarkdownSaveDto(
    var name: String,
    var dataList: List<MarkdownData>
) : SaveDtoI {
}