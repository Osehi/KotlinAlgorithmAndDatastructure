package array

fun main(){
    var arrayOne = arrayOf<String>("one", "two", "three")
    arrayOne[0] = "ten"
    println(arrayOne[0])

    var listOne = listOf<String>("four", "five", "six")
}