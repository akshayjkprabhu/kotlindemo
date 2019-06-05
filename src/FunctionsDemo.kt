fun main() {
    println("Main function")
    println("${addNumbers(10.2)}")
    println("${addNumbers(10.2, 20.0)}")
    println("${addNumbers(y = 10.2)}")
    println("${addNumbers(y = 10.2, x = 3.0)}")
    println("${addNumbers()}")

    displayInfo( names = *arrayOf("Akshay", "Ajay"))
    displayInfo("Akshay", "Ajay")
}

fun addNumbers(x: Double = 1.0, y: Double = 3.2): Double {
    val temp = x + y;
    return temp;
}

fun displayInfo(vararg names:String){
    for(name in names){
        println(name)
    }
}
