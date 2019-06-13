package model

class UserAdmins<T>(credit: T) {
    init {
        display(credit)
    }
}

fun <M> display(prosess: M) {
    println(prosess)
}

fun main(args: Array<String>) {
    var userAdmin = UserAdmins("Akshay")
    var userAdmin2 = UserAdmins<Int>(2)
    var admin3 = UserAdmins<Double>(3.0)
    display(22.0)
    display("No one")
}