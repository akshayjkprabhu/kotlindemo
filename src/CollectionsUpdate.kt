/**
 * mutable : You can update
 * Immutable - you cannot update
 */
fun main() {
    //Im-mutable
    var list = listOf("Akshay", "Ajay")
    for (name in list) println(name)

    //Mutable
    val mutableList = mutableListOf("Akshay", "Ajay")
    mutableList[0] = "Akshay Prabhu"

    for (name in mutableList) {
        println(mutableList)
    }
}
