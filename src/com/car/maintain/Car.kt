package com.car.maintain

class Car(
    val type: String, val model: Int, val price: Double,
    val milesDrive: Int, val owner: String
) {
    init {
        println("Object is created")
    }

    fun getCarPrice(): Double {
        return this.price - milesDrive * 10
    }
}

fun main() {
    val car1 = Car("BMW", 2015, 10000.0, 105, "Akshay")
/*    println(car1.type)
    println(car1.owner)
    println(car1.getCarPrice())*/

    val car2 = Car("Toyota", 2019, 39000.0, 105, "ANJKSDf")
/*    println(car2.type)
    println(car2.owner)
    println(car2.getCarPrice())*/

    //listOfCars
    val listOfCars = arrayListOf<Car>()
    listOfCars.add(car1)
    listOfCars.add(car2)
    for (car in listOfCars) {
        println(car.type)
        println(car.owner)
        println(car.getCarPrice())
    }
}