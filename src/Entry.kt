import kotlin.test.todo

fun main() {
    collections()
}


/**
 * Collections
 */
fun collections() {
    val numList = 1..10
    println(numList)
    val single = numList.filter { x -> x % 2 == 0 }.indexOf(10)
    println(single)

    val reduce = numList.reduce { x, y -> x + y }
    println(reduce)

    val fold = numList.fold(10, { x, y -> x + y })
    println(fold)

    val numList1 = 1..20
    println("${numList1.any { it > 10 }}") //checks for atleast one item satisfying the condition
    println("${numList1.all { it % 2 == 0 }}") // if all the elements return true then it will return true

    var list = numList1.filter { x -> x > 10 }
    println(list)

    list = list.map { it * 7 }
    println(list)
}


/*********************************
 * HIGHER ORDER FUNCTIONS
 * ***************************************/
fun higherOrderFunctions() {
    var twiceOf = mathOperation(2);
    val thriceOf = mathOperation(3)

    val range = arrayListOf(1, 2, 3, 4, 5)
    mathOnList(range, thriceOf)

    mathOnList(range) { num: Int -> num * 5 }


}

fun mathOperation(num: Int) = { multiplier: Int -> num * multiplier }

fun mathOnList(list: ArrayList<Int>, init: (Int) -> Int) {
    for (item in list) {
        println("Math on List : " + init(item))
    }

}

/************************************************************
 * ARRAY DEMO
 ************************************************************/

fun arrayDemo() {
    var sqArr = Array(50) { x -> (65 + x).toChar() }

    for (item in sqArr) {
        println(sqArr.get(sqArr.indexOf(item)))
    }
}


fun listProperties() {
    val list = arrayOf("akshay", "Nagesh", "Nithin", "Shrinivas")
    println(list)
    val strings = list.copyOf();
    println(strings)
    println(strings.copyOf(3)[2])
    println(strings.copyOfRange(0, 3)[2])
}

/**
 * Condiations
 * */

fun give(obj: Any): String? {
    return when (obj) {
        1 -> return "One"
        "Cat" -> "Mew"
        else -> "200"
    }
}

