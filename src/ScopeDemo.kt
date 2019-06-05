var name: String? = null //global variable
fun showUserInfo() {
    println(name)
}

fun main() {
    name = "akshay" // local variable
    showUserInfo()
}