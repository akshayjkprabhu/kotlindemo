fun show(cardId: Int) {
    //check if the card is valid
    println("Card Id : ${cardId}")
}

fun show(name:String){
    //check if the user is active
    println("Name : $name")
}

fun main(){
    show(5)
    show("Akshay")
}