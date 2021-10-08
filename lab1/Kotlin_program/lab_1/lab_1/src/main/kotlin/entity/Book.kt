package entity

class Book(
    val author: String,
    val title: String,
    val year: Int,
    val language: String,
    ) {

    override fun toString(): String {
        return "autor: $author \ntitle: $title\nyear: $year \nlanguage: $language"
    }

    private constructor(builder: Builder) : this(builder.author, builder.title,  builder.year, builder.language)

    class Builder {
        var author: String = "Unknown author"
            private set
        var title: String = "No information about title"
            private set
        var year: Int = 0
            private set
        var language: String = "No information about language"
            private set


        fun setAuthor(author: String) = apply { this.author = author }

        fun setTitle(title: String) = apply { this.title = title }

        fun setYear(year: Int) = apply { this.year = year }

        fun setLanguage(language: String) = apply { this.language = language }

        fun build() = Book(this)
    }
}