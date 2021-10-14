package weekone

/**
 * Created, Monday, 11-Oct-2021
 */
/**
 * Why choose kotlin over java
 * a. kotlin is null safe.
 * What does it mean by "Null Safe".
 * b. kotlin is interoperable with java. ( both java and kotlin are compiled to bytecode, this makes it interoperable)
 */
/**
 * Learning.
 * 1. Print Hello World
 * 2. val and var
 * 3. Declaring variable and its types.
 * 4. Arithmethic operators
 * 5. Working with Decimals: Float, Double
 * 6. Strings
 * 7. Logical and comparison operator
 * 8. If conditions
 * 9. Nullable
 * 10. Array
 * 11. When
 * 12. function
 * 13. vararg, default and named parameters
 * 14. Extention Function
 */
/**
 * A. Identify a real life situation and use code to program it.
 * e.g a school.
 */
/**
 * compile the exercises
 */
fun main(){
//    makingString()
//    operations()
//    volume()
//    logical()
//    exerciseOne()
//    exerciseTwo()
//    ifCondition()
//    checkIsAPalindrome()
//    urAge()
//    count()
//    exerciseOnPower()
//    getMaxItem()
//    arrayList()
//    addToList()
//    pickNumbers()
//    println(evaluateExponent(2, 3))
//    sumOfNNumber(5)
//    var list = listOf<Int>(1,2,3)
//    println(list[2])
//        var result = findANumber(listOf(1,15,35,70), 35)
//        println(result)
//    collectNumber(9,8,7,6,5,4,3,2,1)
//    appendName("Osehiase")
//    appendName("Osehiase", "Blessings")
    val input = 49
    val result = input.isPrime()
    println(result)
}

/**
 * Working with Decimal numbers
 */
fun volume(){
    // find the volume of a sphere
    val pi:Double = 3.141592
    val radius:Double = 5.5
    val volume:Double = 0.75 * Math.PI* Math.pow(radius, 3.toDouble())
//    val compute = Math.pow(2.toDouble(), 3.toDouble())
    println(volume)
}

fun operations(){
    val x = 20.15
    val y = 8.0
    println("The result of x / y is: ${x / y}")
}

fun declareVariables(){
    var cost:Int = 10
}

// string
fun makingString(){
    // save your name in a string variable
    val urName:String = "Osehiase"
    // print your name in uppercase and reverse
    println("My name is ${urName}")
    println("Here is my name is uppercase: ${urName.toUpperCase()}")
    println("Here is my name in a reverse form: ${urName.reversed()}")
}

// Logical and comparison operator
fun logical(){
    // comparison operators likes ==, !=, <, >, <=, >=
    // logical operator &&, ||
    // What is a logical operator?
    // A logical operator is used to manipulate Boolean values.
    val a = 5
    val b = 6
//    println(a != b)
//    println(a < b)
//    println(a <= b)
//    println(a > b)
//    println(a >= b)
    println(!(a < b))

    val x = 15
    val y = 10
    println((a < b))
}

// logical expression exercise
fun exerciseOne(){
    val simpleExpression = 3 > 4 || 4 > 3 && 4 <= 4
    // 3 > 4 = False
    // 4 > 3 = True
    // 4 <= 4 = True
    // False || True && True
    // my answer is True
    // I started evaluating from the left-hand-side
    println(simpleExpression)
}
// logical expression exercise
fun exerciseTwo(){
    val bool = true
    val x = 9
    val y = 3
    val z = 9
    val hardExpression = !(x != z) && bool || z > (x + y) && (!bool || y < z)
    // my solution
    // i found the meaning of logic today: it means using a set of principles
    // to arrange a set or collection of elements
    // my logic here is to breakdown the operation by taking the comparison
    // expression bit by bit.
    // !(x != z) = !(False) = True
    // True
    // z > (x + y) = 9 > 12 = False
    // (!bool || y < z) = ( False || True) = True
    // True && True || False && True = True || False = True.
    // the answer is True
    println(hardExpression)
}
// if conditions
fun ifCondition(){
    val x = 150
    val y = 15

    if (x < y){
        println("x is lesser than y")
    } else if (x > y){
        println("x is greater than y")
    } else {
        println(" x is equal to y")
    }
    println("this will always be executed")
}
// exercise on ifConditions
fun checkIsAPalindrome(){
    val sampleString = "android_devs"
    // check if the reversed string is equal to the given string
    val reversedString = sampleString.reversed()
    if (sampleString == reversedString){
        println("The string ${sampleString} is a palindrome")
    } else {
        println("The string ${sampleString} is not a palindrome ")
    }
}
// exercise on null and userInput
fun urAge(){
    // print "Please enter your age:
    // receives a userInput of their age.
    // check their age range and printout their range
    val welcomeMsg = "Please enter your age"
    println(welcomeMsg)
    var urAge = readLine()
    when(urAge?.toInt()){
        in 0..11 -> println("You are a child")
        in 12..17 -> println("You are a teenager")
        in 18..25 -> println("You are a young youth")
        in 26..35 -> println("You are a matured youth")
        in 36..45 -> println("You are a matured adult")
    }
}
// array & loops
fun useArrayLoop(){
    val myArray = arrayOf("Hello", "Guys", "")
}

fun count(){
    var num = 10
    // count from 10 to 0
    while (num >= 0){
        println(num)
        num--
    }
}

// exercise
fun exerciseOnPower(){
    val callForFirstInput = "Enter number 1:"
    val firstNumber = readLine()?.toInt()
    val callForSecondInput = "Enter number 2:"
    val secondNumber = readLine()?.toInt()
    if (firstNumber != null && secondNumber != null){
        val compute = Math.pow(firstNumber.toDouble(), secondNumber.toDouble())
        println("${firstNumber} to the power of ${secondNumber} is ${compute}")
    }


}

// array, find the item with the highest value
// without sorting
fun getMaxItem(){
    val myArray = arrayOf(4,5,6,10,2,3)
    var max = myArray[0]
    for (item in myArray){
        if (item > max){
            max = item
        }
    }
    println(max)
}

// difference between array and list
fun arrayList(){
    val array = arrayOf(1,2,3)
    val list = listOf(4,5,6)
    // extract items
//    val itemAtIndexZero = array[0]
    // ** an item in an array can be changed
    array[0] = 7
    val itemAtIndexZero = array[0]
    println(itemAtIndexZero)
    // ** Adding to an array
    // => You cannot add to an array. i.e, cannot increase the size of an array
    // ==> What can be done in a list
    val firstItemInList = list[0]
    println(firstItemInList)
    // change item in a list
//    list[0] = 3: cannot change the item in a list
}

// using the console to add items to a list
// Anothe exercise for loop; is to calculate the
// 1st n fibonacci numbers.
fun addToList(){
    val list = mutableListOf<Int>()
    for (i in 1..10){
        val x = readLine()?.toInt()
        // do a null check because my input is a nullable variable
        if (x != null ){ // I don't want to add any null item
            list.add(x)
        }
    }
    println(list)
}
// exerciseOnList
// write a code to receive 5 number from the console
fun pickNumbers(){
    // store the inputs here
    val storage = mutableListOf<Int>()
    // use a loop to set a limit for 5-inputs
    for (i in 1..5){
        val userInput = readLine()?.toInt()
        if(userInput != null){
            storage.add(userInput)
        }
    }
    println(storage.reversed())
    // Task_2: ask a user to add 5-numbers
    // print the average of those numbers
}
// exercise on when
// Write a program to ask a user his/her country
// of origin...
// And greet him the way they greet in his country.
//
fun locationAndGreet(){

}
// another when assignment is calculate the 1st n fibonacci number: Part-15.
// use of when
fun knowUrAge(){

    val age = 12
    when(age){
        in 0..5 -> println("You are a young kid")
        in 6..17 -> println("You are a teenager")
        18 -> println("Finally, you are 18")
        19, 20 -> println("You are a young adult")
        in 21..65 -> println("You are an adult")
        else -> println("You are really old")
    }
}

// function
// create a function that evaluates the exponent of a number
fun evaluateExponent(base:Int, exponent:Int):Int{
    var result = 1
    for (i in 1..exponent){
        result = base * result
    }
    return result
}
// the assignment
// write a function that takes an n number; return the
// sum from 1 to n.
fun sumOfNNumber(n:Int){
    var sum = 0
    for (i in 1..n){
        sum += i
    }
    println(sum)
}
// still on functions: Functions with Return Value
// parameters ( primitive data type parameter and non-primitive data type) such as string, Int,
// list.
// exercise on function:
// search for a number in the list.
// if found return a msg - the index of the number is ---
// if not found return: - the index of the number is -1

fun findANumber(list:List<Int>, target:Int):String {
    // use a forloop to search

    for (index in 0 until list.size){
        if (list[index] == target){
            return "The imdex of the ${target} is ${list.indexOf(list[index])}"
        }
    }
    return "The index of the ${target} is -1"
}

// use of vararg,
fun collectNumber(vararg num :Int){
    for (item in num){
        println(item)
    }
}
// use of named parameter and default parameter
fun appendName(firstName:String, lastName:String = "Ehilen"){
    println("My name is ${firstName} ${lastName}")
}
// Assignment on named and default function
// create a function called an alternating function
// an alternating function adds the 1st, substrats the 2nd number
// Part-18
fun alternatingSum(vararg nums:Int){
    // I will do it.
}
// extension function example
// am adding an extension function to the Int-class.
// this function has an issue; it says 49 is a prime number
// that is not true.
// I will check it later...
fun Int.isPrime(): Boolean {
    for (i in 2 until this - 1){ // this is used for the class where the function is attached
        if (this % 2 == 0){
            return false
        }
    }
    return true
}

// assignment
// write an extension for a given list that returns the PRODUCT
// of that list.
// For example: The product of [1,2,3,4,5,6] is 720
fun product(){
    
}


fun miscellaneous(){
    var isAvailable:Boolean = false
    println("Hello World")
    var age = 19
    println("I am ${age} years old")
}