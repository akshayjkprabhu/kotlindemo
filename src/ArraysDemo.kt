fun main() {

    println("Pets App")
    println("Enter the number of animals you want to pet ")
    val petCount = readLine()!!.toInt()


    val listOfPets: Array<String> = Array(petCount) {
        print("Enter pet name ")
        readLine()!!.toString()
    }

    for (i in 0 until petCount) {
        println("Pet ${i + 1} is ${listOfPets[i]}")
    }
}

