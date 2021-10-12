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
 */
/**
 * A. Identify a real life situation and use code to program it.
 * e.g a school.
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
    urAge()
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

fun miscellaneous(){
    var isAvailable:Boolean = false
    println("Hello World")
    var age = 19
    println("I am ${age} years old")
}