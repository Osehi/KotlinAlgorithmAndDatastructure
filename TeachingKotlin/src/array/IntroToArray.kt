package array

fun main(args:Array<String>){

    var listOfCountries = Array(5){""}

    // so today I saw the difference between Array and List
    // Items of Array can be updated
    // Items of List cannot be updated
    // Array and list has a fixed size

    var listOfSocks = listOf<Int>(1, 2, 3)


    var shoppingItems = Array(5){2}
    println(shoppingItems[0])
    println(shoppingItems[2])
    println(shoppingItems.toList())
    println(shoppingItems.set(2, 10))
    println("This is the value of index two(2) ${shoppingItems[2]}")

//    allCountriesInAnArray()
//    allCountriesVisited()
//
//    // declare a variable
//    val players = arrayOf<String>()
//    println(players.size)
//
//    val result = 1 > 2
//    println(result)
}
//1 Collection
// a. Array. b. List. c. Map. d. Set
//. To show me all the countries you have visited
fun allCountriesVisited(){
    val country1 = "Nigeria";
    val country2 = "Cameroon"
    println(country1)
    println(country2)
}

// create a list of countries in an array
// accessing the array
// array methods: .lastIndex, .last, .first
// how to create an array
// what is the difference between an array and a list
fun allCountriesInAnArray(){
    val listOfCountries = arrayOf<String>("Nigeria", "USA", "UK")
    println(listOfCountries)
    val currentCountry = "Ghana"
    val hasVisited = currentCountry in listOfCountries
    println(hasVisited)

}
