import java.util.*
import kotlin.collections.ArrayList

fun main() {
    println("Pets App")
    val listOfPets = LinkedList<String>()
    do {
        val petName = readLine()!!.toString();
        if (petName != "quit") {
            listOfPets.add(petName)
        }
    } while (petName != "quit")

    for (i in 0 until listOfPets.size) {
        println("Pet ${i + 1} is ${listOfPets[i]}")
    }

    for (pet in listOfPets) {
        println("Pet $pet")
    }

    if(listOfPets.contains("cat")){
        println("Your cat is eligible for special care!!")
    }
}