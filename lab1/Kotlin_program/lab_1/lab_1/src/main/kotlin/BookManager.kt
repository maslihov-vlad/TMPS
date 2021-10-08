import entity.Book
import factory.Book1BuilderFactory
import factory.Book2BuilderFactory
import factory.Book3BuilderFactory

object BookManager {

    fun createBook(id: Int): Book {
        val bookBuilderFactory = when (id) {
            1 -> Book1BuilderFactory()
            2 -> Book2BuilderFactory()
            3 -> Book3BuilderFactory()
            else -> throw IllegalArgumentException("there's no book with id $id")
        }
        return bookBuilderFactory.createBookBuilder().build()
    }

}