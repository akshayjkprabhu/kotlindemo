package model

import java.util.*

abstract class Credit {
    open fun creditCardId(): String {
        return generateId();
    }

    abstract fun generateId(): String

}

class UserInfo : Credit() {
    override fun generateId(): String {
        return Calendar.getInstance().timeInMillis.toString()
    }

    override fun creditCardId(): String {
        return super.creditCardId() + "#"
    }

    fun getInfo(): String {
        return creditCardId();
    }


}

fun main() {
    val credit = UserInfo()
    println("Credit card Id : ${credit.creditCardId()}")
    println("Credit card Id : ${credit.getInfo()}")
}

