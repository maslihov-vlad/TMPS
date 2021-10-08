package factory

import entity.Book

class Book1BuilderFactory: BookBuilderFactory {
    override fun createBookBuilder(): Book.Builder {
        return Book.Builder()
            .setTitle("Fahrenheit 451")
            .setAuthor("Ray Bradbury")
            .setLanguage("En")
            .setYear(1953)
    }
}