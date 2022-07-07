package com.kaiware.moikredit.domain.markdown.dto

import com.kaiware.moikredit._generic.data.ResponseDtoI
import com.kaiware.moikredit._generic.util.Mapper
import com.kaiware.moikredit.domain.markdown.Markdown
import com.kaiware.moikredit.domain.markdown.MarkdownData.MarkdownData
import org.springframework.stereotype.Component

class MarkdownFullResponseDto(
    var id:Long,
    var name:String,
    var dataList: List<MarkdownData> = emptyList()
) : ResponseDtoI {
@Component
companion object : Mapper<Markdown, MarkdownFullResponseDto> {
    override fun toResponseDto(entity: Markdown, lang: String): MarkdownFullResponseDto {
        return MarkdownFullResponseDto(
            id=entity.id ?: 0,
            name = entity.name,
            dataList = entity.dataList
        )
    }
}
}