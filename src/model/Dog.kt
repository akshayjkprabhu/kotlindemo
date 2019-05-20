package model

class Dog(name: String, height: Double, weight: Double, private var owner: String) : Animal(name, height, weight) {
    init {
    }

    override fun getInfo(): String {
        return "${super.getInfo()} and owned by ${owner}"
    }
}