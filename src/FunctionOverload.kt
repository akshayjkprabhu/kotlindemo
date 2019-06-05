fun main() {
    println(addNumbers(1, 2))
    println(addNumbers(1, 2, 3))
    println(addNumbers(1, 2, 3, 4))
    //todo you can also use varargs for this kind but if the data type of arguements of overloaded function
    //differs then varargs will not work
}

fun addNumbers(number1: Int, number2: Int): Int {
    return number1 + number2
}

fun addNumbers(number1: Int, number2: Int, number3: Int): Int {
    return addNumbers(addNumbers(number1, number2), number3)
}

fun addNumbers(number1: Int, number2: Int, number3: Int, number4: Int): Int {
    return addNumbers(addNumbers(number1, number2, number3), number4)
}