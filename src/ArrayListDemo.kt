fun main() {

    println("Pets App")
    val listOfPets = ArrayList<String>()
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
}