package com.files

import java.io.FileReader
import java.io.FileWriter
import java.lang.Exception

fun main(args: Array<String>) {
    readFromFile()
    println("1 for read 2 for write")
    val choice = readLine()!!.toInt()
    if (choice == 1) {
        readFromFile()
    } else if (choice == 2) {
        do {
            val str = readLine().toString()
            if (!"ESC".equals(str))
                writeToFile(str)
        } while (!"ESC".equals(str))
    }

}

fun writeToFile(str: String) {
    try {
        val fileWriter = FileWriter("test.txt", true)
        fileWriter.write(str + "\n")
        fileWriter.close()
        println("Data is saved")
    } catch (ex: Exception) {
        println("something went wrong")
    }
}

fun readFromFile() {
    try {
        val reader = FileReader("test.txt")
        var c: Int?
        do {
            c = reader.read()
            if (c != -1) {
                print(c.toChar())
            }
        } while (c != -1)
    } catch (ex: Exception) {
        println(ex.toString())
    }
}
