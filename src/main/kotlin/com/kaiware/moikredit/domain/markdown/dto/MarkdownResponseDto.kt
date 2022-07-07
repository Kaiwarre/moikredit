package com.kaiware.moikredit.domain.markdown.dto

import com.kaiware.moikredit._generic.data.ResponseDtoI
import com.kaiware.moikredit._generic.util.Mapper
import com.kaiware.moikredit.domain.markdown.Markdown
import org.springframework.stereotype.Component


class MarkdownResponseDto(
    var id: Long,
    var name:String,
    var source: String,
): ResponseDtoI {

    @Component
    companion object: Mapper<Markdown, MarkdownResponseDto> {
        override fun toResponseDto(entity: Markdown, lang: String): MarkdownResponseDto {
            return MarkdownResponseDto(
                id=entity.id ?: 0,
                name=entity.name,
                source = entity.dataByLanguage(lang).source
            )
        }

    }
}