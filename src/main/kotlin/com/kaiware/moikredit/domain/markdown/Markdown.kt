package com.kaiware.moikredit.domain.markdown

import com.kaiware.moikredit._generic.data.EntityI
import com.kaiware.moikredit.domain.markdown.MarkdownData.MarkdownData
import javax.persistence.*

@Entity
class Markdown(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Long? = null,
@Column(unique=true)
    var name:String,

    @OneToMany(cascade = [javax.persistence.CascadeType.ALL])
    var dataList: List<MarkdownData> = emptyList()
): EntityI {
    fun dataByLanguage(lang:String): MarkdownData {
        var markdownData = MarkdownData(lang = lang)
        dataList.find {
            it.lang == lang
        }?.let {
            markdownData=it
        }
        return markdownData
    }
}