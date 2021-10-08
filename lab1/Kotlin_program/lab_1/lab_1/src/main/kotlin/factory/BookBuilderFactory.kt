package factory

import entity.Book

interface BookBuilderFactory {
    fun createBookBuilder(): Book.Builder
}