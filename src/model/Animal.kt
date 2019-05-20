package model

open class Animal(private val name: String, private var height: Double, private var weight: Double) {
    init {
        require(height > 0) {
            "Height must be greater than zero"
        }
    }

    open fun getInfo(): String {
        return "$name is $height tall and weighs $weight"
    }

}