package model

import java.lang.Exception

fun main() {
    println("Enter a number")
    val n: Int = readLine()?.toInt() ?: 0

    try {
        val div = 100 / n
        println("Division is : $div")
    } catch (ex: Exception) {
        println("Something went wrong")
    }
    println("App is done")

}