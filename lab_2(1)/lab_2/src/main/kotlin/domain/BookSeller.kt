package domain

import domain.factory.FictionBookFactory
import domain.factory.TechBookFactory
import domain.models.BookStack
import domain.models.DiscountedBook
import java.lang.IllegalArgumentException
import java.math.BigDecimal
import java.math.RoundingMode
import java.util.*
import kotlin.system.exitProcess

object BookSeller {
    private val mAllBooks: BookStack = BookStack()

    fun initialize() {
        mAllBooks.add(TechBookFactory.createBook(1))
        mAllBooks.add(TechBookFactory.createBook(2))
        mAllBooks.add(FictionBookFactory.createBook(1))
        mAllBooks.add(FictionBookFactory.createBook(2))
    }

    fun listBooks() {
        println("Here are the books we have:\n${mAllBooks.getName()}")
    }

    fun sellBooks() {
        val scanner = Scanner(System.`in`)
        println("Which book are you interested in?\n(enter 0 for all books or 1-4 for a specific book)")
        var chosenBook = when (val a = scanner.nextInt()) {
            0 -> mAllBooks
            in 1..4 -> mAllBooks.get(a-1)
            else -> throw IllegalArgumentException("wrong input")
        }
        println(chosenBook.getDescription())

        println("Do you want to proceed to proceed to checkout? (y/n)")
        if ("y" !in scanner.next()) exitProcess(0)

        println("Do you have a discount card? (y/n)")
        if ("y" in scanner.next()) {
            chosenBook = DiscountedBook(chosenBook)
        }

        println("Ok. It will cost $${chosenBook.getCurrentPrice().limitDecimalPlaces(2)}")
    }


    private fun Double.limitDecimalPlaces(decimalPlaces: Int): Double {
        return BigDecimal(this).setScale(decimalPlaces, RoundingMode.FLOOR).toDouble()
    }

}