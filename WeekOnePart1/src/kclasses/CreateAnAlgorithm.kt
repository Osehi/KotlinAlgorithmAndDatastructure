package kclasses

//data class SinglyLinkedList<>

fun main(){
    getFirstLetterAsUpperCase()
}

fun getFirstLetterAsUpperCase(){
    val name = "osehiase"
    // use substring to get the first letter
    val output = name.substring(0,1)
    println(output.toUpperCase())
}