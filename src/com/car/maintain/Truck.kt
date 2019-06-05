package com.car.maintain

class Truck : CarOptions {
    var subType: String? = "None"

    init {
        println("Object is created")
    }

    constructor() : super()

    constructor(type: String, model: Int, price: Double, milesDrive: Int, owner: String, subType: String)
            : super(type, model, price, milesDrive, owner) {

        this.subType = subType;
    }

    constructor(type: String, model: Int, price: Double, milesDrive: Int, subType: String)
            : super(type, model, price, milesDrive) {

        this.subType = subType;
    }

    override fun getCarPrice(): Double? {
        return getPrice()?.minus(milesDrive?.times(20) ?: 0)
    }

    fun getCarPriceWrapper(): Double? {
        return super.getCarPrice();
    }
}


fun main() {
    val car1 = Truck("BMW", 2015, 10000.0, 105, "Akshay", "NN")
    val car2 = Truck("Toyota", 2019, 39000.0, 105, "ANJKSDf")
    var car3 = Truck()


    //listOfCars
    val listOfCars = arrayListOf<Truck>()
    listOfCars.add(car1)
    listOfCars.add(car2)
    listOfCars.add(car3)
    for (car in listOfCars) {
        println(car.type)
        println(car.owner)
        println(car.getCarPrice())
        println(car.getCarPriceWrapper())
    }
}