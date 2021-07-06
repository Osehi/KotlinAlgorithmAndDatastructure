package partonemonday

import java.lang.ClassCastException

/**
 * content
 * 1.
 * 2.
 * 3.
 * 4.Function
 * 5. Variables
 */

fun main(){
    exampleList()
    declareVariable()
    var costOfCorn:String
//    checkTypeUsingIs()
//    anotherWayToCheck()
//    exampleSmartAndTypeCast()
//    println(divider(8))

    var compareValues = 5 < 10
    println(compareValues.presentBoolean())

    var description = "George"
    println(description.lengthOfString())
    println(description.removeLastChar())
    println(description.returnAStrint())

}


fun checkTypeUsingIs(){
    var myName:Any = 0.50000
    when(myName){
        is String -> println("It is a String")
        is Int -> println("It is an Int")
        is Double -> println("It is a Double")
        is Float -> println("It is a float")
        else -> println("Is not of any of this type")
    }

}

fun anotherWayToCheck(){
    var myName = "Osehi"
    println("The data type is: ${myName::class.simpleName}")
    println("Yet another way to check type and the type is: ${myName.javaClass}")
    println("Try something else on the type and the type is: ${myName::class.java}")
}
// class work
/**
 * An employee has the following details; name, age, salary and
 * an emp_id.
 * store these details in a list
 * print out the data types of the items
 */
fun activityOnTypes(){
    var name = "Praveen"
    var age = 24
    var salary = 5000.55
    var emp_id = 12345f
    val employeeDetails: List<Any> = listOf(name, age, salary, emp_id)

    for (attribute in employeeDetails) {
        when (attribute) {
            is String -> println("Name: $attribute ")
            is Int -> println("Age: $attribute")
            is Double -> println("Salary: $attribute")
            else -> println("Not an attribute")
        }
    }
}

fun exampleSmartAndTypeCast(){

    // a safe cast is when you use the "is" keyword
    val anyDataType:Any = "Welcome to class"

    // unsafe cast
    val asAStr = anyDataType as String
    println(asAStr)

//    val numData = anyDataType as Int
//    println(numData) // classcasrException
    try {
        val numData = anyDataType as Int
        println(numData)
    } catch (e:ClassCastException){
        println("failed")
    }

    // smart casting will not cause a crash
    // it returns a null
    val checkForCrash = anyDataType as? Int
    println(checkForCrash)

}
fun useOfFunctions(){
    // for reuse of code

}

// a.
fun multipleOfTwo(num:Int): Int{
    return (2 * num)
}

//b. get result from a function
// var result = multipleOfTwo(2)

// c. many parameters
fun myAddress(firstName:String, lastName:String, city:String):String{
    return "My name is $firstName $lastName; I live in $city"
}

//d. single expression function
fun divider(y:Int):Int = y / 2 // fun divider(y:Int) = y / 2

//e. infix functions
// infix functions are functions that do not require a dot to be
// called. they don't have parenthesis like this ()
// e.g, step 2,

// f. member functions
// these are function defined inside a class
// class Resturant { fun payment(){println("pay in cash"} }

//e. Extension function
// instead of adding a method inside a class; you do that
// by adding a dot to the class
// an extension function that returns length of String
fun String.lengthOfString():Int{
     return this.length
}
// extension function that removes last character
fun String.removeLastChar():String {
    return this.substring(0, this.lastIndex)
}
// extension function that returns a string
fun String.returnAStrint():String {
    return this
}

fun Boolean.presentBoolean():Boolean{
    return this
}

// exercise ; create an extention function with Int, Boolean
// and write a unit test for it.

// variable. // a container, holds a value in memory
// variable declaration, variable initialization
fun declareVariable(){
    val city:String
    val location:String

    // initialization of variable
    city = "Lagos"
    location = "Benin"
    println(city)

    // re-assign the variables
//    city = "Oyo" // val cannot be re-assigned

    var favoriteFood:String
    var myFavoriteMusic:String

//    println(favoriteFood) // variable favorite must be initialized
    // initialize variable
    favoriteFood = "Jollof Rice"
    myFavoriteMusic = "Gospel"
    println(myFavoriteMusic)
}

// assignment on variable
// how to use "const to declare a variable
// what is lateinit, lazy,
// ====== Operators
fun arithmeticOperators(a:Int, b:Int, c:Int){
    val addition = a + b
    val substraction = a - b
    val multiply = a * b * c
    val division = a / b
    val modulus = a % b
}
fun concatenationOfString(){
    val first = "Al"
    val second = "pha"
    val third = "bet"
    val newWord = first + second + third
    println(newWord)
}
fun assignmentOperators(){
    val shares = arrayOf("FirstBank", "SterlingBank", "AccessBank")
    var count = 0
    for(stock in shares){
        println(stock)
        count += 1 // count = count + 1
    }
}

fun anotherAssignmentOperator(){
    var priceOfDollar = 400
    priceOfDollar += 50
    println(priceOfDollar)
}
// what does the following mean
// count -= 1, count /= 2, count %= 2
// increment/ decrement: count++, count--
// comparison & equality operator
fun comparisonAndEqualityOperator(){
    // what value do you get when you compare two or more values
    val result = 5 > 10
    // !=, ==, >, <, >=
}
// logical operator
// ||, &&
// other operators
// in Operator // used in forloop.
// index access operator  // a[i]
// === collection
// collection is used to storing multiple items
fun collectionTypes(){
    // list, set, map: they are immutable and mutable
}
//example
fun exampleList(){
    val friends = listOf<String>("Kola", "Hope", "Ehijie")
    //access
    println(friends[0])
    println(friends[0])
    // use forloop
    // use forEach
    friends.forEach{friend -> println(friend)}

}
fun exampleMutableList(){
    val myFavoriteColor = mutableListOf<String>("red")
    myFavoriteColor.add("blue")
    myFavoriteColor.add("pink")
    myFavoriteColor.forEach { color -> println(color) }
}
fun exampleSet(){
    val birthdaysOfFriends = setOf<String>("7-Fenry")
    birthdaysOfFriends
    println()
    birthdaysOfFriends.forEach{birthday -> println(birthday)}
}
fun mutableSet(){
    var birthdayOfFriend = mutableSetOf<String>("Kola")
    // add items
    birthdayOfFriend.add("1-feb")
    // print out
}

fun exapmleMap(){
    val sportTeam = mapOf<String, MutableList<String>>("Nigeria" to mutableListOf<String>("Amokachi"))
    sportTeam.forEach{team -> println(team)}
}
fun exampleMutableMn(){
    var sportTeam = mutableMapOf<String, MutableList<String>>("USA" to mutableListOf<String>())
    // add remove and iterate..
}
