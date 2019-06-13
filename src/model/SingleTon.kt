package model

class SingleTon {
    var name: String? = null

    private constructor() {
        println("Instance is created")
    }

    fun show() {
        println("Name : ${name}")
    }

    companion object {
        val instance: SingleTon by lazy { SingleTon() }

        fun getI(): SingleTon = instance;
    }
}

fun main() {
    var instance = SingleTon.getI()
    instance.name = "Akshay"
    instance.show()
    instance = SingleTon.getI()
    instance.show();
    instance = SingleTon.getI()
    instance.show()

}