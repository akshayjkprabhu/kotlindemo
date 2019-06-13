package model

class Outer {
    private val name: String? = "Akshay"
    private var innerClass: Nested? = null;

    constructor() {
        var innerClass = Nested();
        this.innerClass = innerClass
    }

    /**
     * Inner class can not be instantiated from outside of the class
     * Class which is written inside of another class (not nested class)
     * cannot access outee class's members
     */
    inner class Nested {
        fun show() {
            println("Nested ${name}")
        }

    }

    fun getNested(): Nested? = innerClass

}

fun main() {
    var outer = Outer()
    outer.getNested()?.show()
}