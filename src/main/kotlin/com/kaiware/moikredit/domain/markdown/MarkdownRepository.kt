package com.kaiware.moikredit.domain.markdown

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MarkdownRepository: JpaRepository<Markdown, Long> {
    fun findByName(name: String):Markdown?
}