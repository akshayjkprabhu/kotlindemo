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

/**
 * Delegation
 */

class PayPal(client: CreditCard) : CreditCard by client {
    fun print() {
        println(this.creditCardNo)
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

    val payPal1 = PayPal(visa);
    payPal1.print()


    val master = MasterCard("125545")
    master.score(51)


    val payPal2 = PayPal(master);
    payPal2.print()
}