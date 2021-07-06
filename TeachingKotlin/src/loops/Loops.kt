package loops

fun main(){

    val listOfCountries = arrayOf<String>("Nigeria", "USA", "UK")

//    var i = 0
//    while (i < listOfCountries.size){
//        println("These are the countries I visited $i : ${listOfCountries[i]}")
//        i += 1
//    }

    // do while loop
    var i = 0
    do {
        println("These are the countries I visited $i : ${listOfCountries[i]}")
        i += 1
    } while (i < listOfCountries.size)

}