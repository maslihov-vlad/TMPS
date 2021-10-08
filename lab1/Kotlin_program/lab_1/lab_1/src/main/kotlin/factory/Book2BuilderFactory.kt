package factory

import entity.Book

class Book2BuilderFactory: BookBuilderFactory {
    override fun createBookBuilder(): Book.Builder {
        return Book.Builder()
            .setTitle("Just for Fun")
            .setAuthor("Linus Torvalds, David Diamond")
            .setLanguage("En")
            .setYear(2002)
    }
}