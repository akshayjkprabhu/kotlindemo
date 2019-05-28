fun main() {

    var listOfUsers = HashMap<Int, String>()
    listOfUsers[12] = "Akshay"
    listOfUsers[22] = "Ajay"
    listOfUsers[22] = "Ajay2"
    listOfUsers[23] = "Ajay3"

    for (key in listOfUsers.keys) {
        println("${key} : ${listOfUsers[key]}")
    }

    listOfUsers.forEach { x, y ->
        println("$x :  $y")
    }
}