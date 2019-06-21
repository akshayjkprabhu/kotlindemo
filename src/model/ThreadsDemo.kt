package model

import java.lang.Exception

fun main() {
    var threadOne = UserThread("Thread one")
    threadOne.start()

    threadOne = UserThread("Thread two")
    threadOne.start()
    threadOne.join()
    println("Thread is run")
}

class UserThread(val threadName: String) : Thread() {

    override fun run() {
        super.run()
        var count = 0;
        while (count <= 10) {
            println("${threadName} count is $count")
            count++
            try {
                sleep(1000)
            } catch (ex: Exception) {
                println(ex.toString())
            }
        }
    }
}