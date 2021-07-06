package teachinclass

// what is a class
// A class is a blue print use to create objects having properties and behaviours.
// Exercise;
class Person(val name:String, val gender:String, val address: Address):ToDo{

    override fun works(): String {
        return "He works at the Hospital"
    }

    override fun drives() {
        super.drives()
    }

}

class Address(val city:String, val country:String){

}

// what is an interface
// no constructor, abstract method, abstract properties
interface ToDo {

    fun works():String

    fun drives(){
        println("he drives to work daily")
    }
}

// what is abstract class
// define an abstract class
// show the phone example of the abstract class
// sealed classes //
sealed class Shape {
    class Circle(val radius:Int):Shape()
    class Square(val sideLength:Int):Shape()
}

fun main(){
    val myAddress = Address("Lekki", "Nigeria") // aggregation
    val first = Person("Faithful", "male", myAddress) // composition
}