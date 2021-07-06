
fun main(){
    println(getNthEvenNumber(4))
}


fun getNthEvenNumber(n:Int):Int{

    // get the even numbers
    // how check an even number: when its modulus is 0
    var stack = arrayListOf<Int>()
    var start = 0
    while (start <= n){
        if (start % 2 == 0){
            stack.add(start)
        }
        start++
    }

    // put them in a stack
    // pop out the item from the list
    return stack[stack.size - 1]
}

/**
 * Given a string (s) remove the vowels 'a', 'e', 'i', 'o','u'
 * from it an return the new string
 */

fun removeVowels(){

}