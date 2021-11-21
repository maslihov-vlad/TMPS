package client

import domain.BookSeller


fun main(args: Array<String>) {
    BookSeller.initialize()
    BookSeller.listBooks()
    BookSeller.sellBooks()

}
