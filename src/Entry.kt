fun main() {
    printMessage(prefix = "Hello world", message = "Print")
    printMessage("Printing")
    printMessage(prefix = null)
    val value: Int = add(10, 20)
    printMessage(value.toString(), "")
    printMessage(add(value, 20).toString());
}

fun printMessage(prefix: String?, message: String? = "No message") {
    println(prefix);
}

fun add(a: Int, b: Int) = a + 1;

