package model

class FirstClass {

    var x: Int = 0;

    fun getString() = "Hello World"

    fun getString(x: Int = 10): String {
        return x.toString();
    }

    fun getString(x: Double = 10.0): String {
        return x.toString();
    }


}