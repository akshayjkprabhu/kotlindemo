package com.car.maintain

data class Person(val name: String) {
    private var age: Int = 0;

    constructor(name: String, age: Int) : this(name) {
        this.age = age
    }

    override fun toString(): String {
        return "name is $name and age is $age"
    }
}

fun main() {
    println("-------------Data class------------")
    var person1 = Person("Akshay", 23)
    var person2 = Person("Ajay")
    println(person1.getAge())
}