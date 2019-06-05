package com.car.maintain


fun ArrayList<Int>.findMax(): Int {
    var max: Int = 0;
    this.forEach {
        if (it > max) {
            max = it
        }
    }
    return max;
}

fun main() {
    val listOfInt: ArrayList<Int> = ArrayList<Int>();
    listOfInt.add(10)
    listOfInt.add(20)
    listOfInt.add(40)
    listOfInt.add(30)
    println("List is $listOfInt")
    println("Max value in the list is ${listOfInt.findMax()}")
}

fun Person.getAge(): String {
    return this.name;
}