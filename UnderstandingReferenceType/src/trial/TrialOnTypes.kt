package trial

class Person(val name:String){

}

fun main(){
    // an instance of the class
    val firstPerson = Person("Peace")
//    println(firstPerson.name)
    // another variable
    val checkReference = firstPerson
//    println(checkReference.name)

    val name = "Osehi"
    println(name)
    val hisName = name
    println(hisName)
}