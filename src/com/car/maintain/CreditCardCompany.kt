package com.car.maintain

interface CreditCard {
    val creditCardNo: String
    fun score(age: Int)
}

//Did not inherit anything but following the same structure
class MasterCard(override val creditCardNo: String) : CreditCard {
    override fun score(age: Int) {
        if (age > 50) {
            println("Negative")
        } else {
            println("Positive")
        }
    }
}

class VisaCard : CreditCard {
    override val creditCardNo: String
        get() = "44444"

    override fun score(age: Int) {
        if (age > 60) {
            println("Negative")
        } else {
            println("Positive")
        }
    }
}

fun main() {
    val visa = VisaCard()
    visa.score(51)


    val master = MasterCard("125545")
    master.score(51)
}