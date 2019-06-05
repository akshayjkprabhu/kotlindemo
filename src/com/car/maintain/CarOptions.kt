package com.car.maintain

open class CarOptions {
    var type: String? = null
    var price: Double? = 0.0
    var milesDrive: Int? = null
    var model: Int? = null
    var owner: String? = null

    init {
        println("Object is created")
    }

    constructor()

    constructor(type: String, model: Int, price: Double, milesDrive: Int, owner: String) {
        this.type = type;
        this.price = price
        this.model = model
        this.milesDrive = milesDrive;
        this.owner = owner;
    }

    constructor(type: String, model: Int, price: Double, milesDrive: Int) {
        this.type = type;
        this.price = price
        this.model = model
        this.milesDrive = milesDrive;
    }

    fun getCarPrice(): Double? {
        return this.price?.minus(milesDrive?.times(10)?.toDouble() ?: 0.0)
    }
}

fun main() {
    val car1 = CarOptions("BMW", 2015, 10000.0, 105, "Akshay")
    val car2 = CarOptions("Toyota", 2019, 39000.0, 105, "ANJKSDf")
    var car3 = CarOptions()


    //listOfCars
    val listOfCars = arrayListOf<CarOptions>()
    listOfCars.add(car1)
    listOfCars.add(car2)
    for (car in listOfCars) {
        println(car.type)
        println(car.owner)
        println(car.getCarPrice())
    }
}