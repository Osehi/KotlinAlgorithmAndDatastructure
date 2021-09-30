package weekfive

fun main(){
    val input1 = arrayOf("give", "me", "one", "grand", "today", "night")
    val input2 = arrayOf("give", "one", "grand", "today")
    solve(input1, input2)
}

/**
 * given,
 * magazine = an array of string
 * note = an array of string
 * compare the note to the magazine
 * when it is true to the magazine in length
 */
fun solve(magazine:Array<String>, note:Array<String>){
    var count = 0
    val sizeOfMagazine = magazine.size
    val sizeOfNote = note.size
    // compare the element in note to magazine.
    for (i in 0 until sizeOfNote){
        if (magazine[i] == note[i]){
            count++
        }
    }
    println(count)
    println("----")
    println(sizeOfNote)
    if (count == sizeOfNote){
        println("YES")
    } else {
        println("NO")
    }
}