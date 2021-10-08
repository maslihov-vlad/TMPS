package factory

import entity.Book

class Book3BuilderFactory: BookBuilderFactory {
    override fun createBookBuilder(): Book.Builder {
        return Book.Builder()
            .setTitle("Crime and Punishment")
            .setAuthor("Fyodor Dostoyevsky")
            .setLanguage("Ru")
            .setYear(1866)
    }
}