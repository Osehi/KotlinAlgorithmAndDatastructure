package partonemonday

fun main(){

    numbersType()

    val x = 5 / 2
    println(x)

//    val a:Int = 1
//    val b:Long = a
//    print(b === a)

//    val c:Long? = 1
//    val d:Int? = c
// Type conversion
    val e:Byte = 12
//    val i:Int = b // cannot implicitly convert
    val i:Int = e.toInt()

    val f:Int = 20
    val g:Byte = f.toByte()

    var byteOne:Byte = 1
    // smaller to greater
    var convertByteToInt = byteOne.toInt()
    // greater to smaller
    var integerOne:Int = 5
    // greater to smaller
    var convertInterToByte = integerOne.toByte()
    var integer:Int = 100
    var decimal:Double = 12.5
    // convert interger to Double
//    integer = decimal // Error occur, saying Type mismatch
    // proper way of conversion
    var integerToDecimal = decimal.toInt()
    println(integerToDecimal)
}

/**
 * byte - 8bits, short - 16bits, Int - 32bits, Long - 64bits(Integer type)
 * Float-32bits, Double-64bits(Floating -point types)
 * Booleans - true or false
 */
fun numbersType(){
    //boolean
    var passStatus:Boolean = true
    var qualification:Boolean = true

    // characters
    val gradeType:Char = 'a'
    println("print a character: $gradeType")

    // String
    // String template
    var name = "Osehi"
    println("My name is $name")


}