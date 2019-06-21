package model

import java.util.*
import kotlin.collections.ArrayList

class Person(val name: String, var age: Int) : Comparable<Person> {

    //should return positive if this has has to come after the other
    //should return negative if this has to come before the other
    //should return zero if the two are equal or similar
    override fun compareTo(other: Person): Int {
        return (this.age - other.age)
    }

    override fun toString(): String {
        return "$name $age"
    }
}

fun main(args: Array<String>) {
//    sortListOfStrings()
    sortPeople()
}

/**
 * The class should implement Comparable interface in order for
 * the Collections to perform the sort operation on the lists
 */
fun sortPeople() {
    var people = ArrayList<Person>();
    people.add(Person("Akshay", 22))
    people.add(Person("Ajay", 11))
    people.add(Person("Jayaram", 55))
    people.add(Person("Sowmya", 47))
    println("Before sorting")
    for (person in people) {
        println(person)
    }
    println("After sorting")
    Collections.sort(people)
    for (person in people) {
        println(person)
    }


}

/**
 * ArrayList by implements Comparable interface
 */
fun sortListOfStrings() {
    var listOfNames = ArrayList<String>()
    listOfNames.add("Akshay")
    listOfNames.add("Ajay")
    listOfNames.add("Jayaram K Prabhu")
    listOfNames.add("Sowmya")
    println("Before sort")
    for (name in listOfNames) {
        println(name)
    }
    println("After sort")
    Collections.sort(listOfNames)
    for (name in listOfNames) {
        println(name)
    }
}

