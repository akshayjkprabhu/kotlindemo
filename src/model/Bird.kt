package model

class Bird constructor(val name: String) : Flyable {
    override var flies: Boolean = true;
    override fun fly(distMiles: Double) {
        if (flies) {
            println("Bird ${name} flies ${distMiles} miles")
        }
    }
}