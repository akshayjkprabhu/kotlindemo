/*fun sum(number1: Int, number2: Int): Int {
    return number1 + number2
}*/

fun main() {
    println(sum(10, 2))//basic function


    println("List of numbers")
    val listOfNumbers = listOf(10, 20, 30, 40)
    //Normal for loop (for each)
    for (number in listOfNumbers) {
        println(number)
    }
    //Using lambda
    listOfNumbers.forEach { number ->
        println(number)
    }
}

val sum = { number1: Int, number2: Int -> number1 + number2 }