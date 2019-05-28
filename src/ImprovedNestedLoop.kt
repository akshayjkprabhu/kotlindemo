import java.util.*
import kotlin.collections.HashMap

fun main() {
    println("Enter user information and type print to print Info")
    val userList = HashMap<String, LinkedList<String>>()
    while (true) {
        print("Enter name and place")
        val name: String = readLine().toString()
        println("Enter your pet names or type next")
        if (name == "print") {
            break
        }
        val listOfPets = LinkedList<String>()
        do {
            print("Enter Pet")
            val petName = readLine().toString();
            if (petName != "next") {
                listOfPets.add(petName)
            }
        } while (petName != "next")
        userList.put(name, listOfPets)
    }

    println("===============USER INFO===========================")
    for (userKey in userList.keys) {
        println("Name & Place: $userKey")
        println("And pets : ")
        for (pet in userList[userKey]!!) {
            println(pet)
        }
    }

}