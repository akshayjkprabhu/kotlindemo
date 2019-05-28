fun main() {
    val message = "Welcome to Robosoft"
    val name = "Akshay"
    val greeting = "${name}, ${message}"
    println(greeting)
    println(greeting.toUpperCase())
    println(greeting.trim())
    val tokens = greeting.split(" ")
    for (token in tokens) {
        println("token : $token")
    }
}