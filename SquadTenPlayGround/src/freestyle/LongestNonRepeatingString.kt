package freestyle

fun main(){
    applyWindow()
}


// applying the sliding window
fun applyWindow(){
    // given a string
    val testString = "abcabcdabcabcde"
    // create an empty mutable set
    var baseChecker = mutableSetOf<Char>()
    // left hand side index
    var start = 0
    var end = 0
    var max = 0

    while (end < testString.length){
        if (!baseChecker.contains(testString.toCharArray()[end])){
//            println("This is if it contains: ${testString.toCharArray()[end]}")
            baseChecker.add(testString.toCharArray()[end++])
//            println("This is adding to the set-list: ${testString.toCharArray()[end++]}")
            max = Math.max(max, baseChecker.size)
        } else {
            baseChecker.remove(testString.toCharArray()[start++])
//            println("This is removal: ${testString.toCharArray()[start++]}")
        }
    }
    println(max)

}