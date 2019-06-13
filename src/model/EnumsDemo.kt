package model

enum class Direction {
    NORTH, SOUTH, EAST, WEST
}

fun main(args: Array<String>) {
    var userDir = Direction.WEST;
    if (userDir == Direction.EAST) {
        println("He went to east")
    } else {
        println("I donn't know where he went")
    }
}
