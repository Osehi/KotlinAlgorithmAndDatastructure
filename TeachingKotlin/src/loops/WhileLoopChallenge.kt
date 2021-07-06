package loops

fun main() {
    /*
    * Challenge 1:
    * Print numbers from 1 to 15, using a while loop.
    *
    * Challenge 2:
    * Create an array or list of names. Using a do-while loop, and an iterator, print the names in a reverse order.
    * Make sure to check that the iterator is within the bounds of the array's size. (from `lastIndex` to 0).
    * */
//    printNumbersFromOneToFifteen()
//    printThisListInReverse()
    doAReversePrint()


}

fun printNumbersFromOneToFifteen(){
    var i = 1
    while (i <= 15){
        println(i)
        i += 1
    }
}

fun printThisListInReverse(){
    // the boundary is between 0 and the lastIndex
    // first condition: if( i < 0 || i > classMembers.lastIndex) return at the do condition
    // at the while condition: i < classMembers.size && i > 0
    var classMembers = arrayOf("Abass", "Emmanuel", "Ibrahim")
    var i = classMembers.size - 1
    do {
        println(classMembers[i])
        i -= 1
    } while (i >= 0)
}

fun doAReversePrint(){
    var classMembers = arrayOf("Abass", "Emmanuel", "Ibrahim")
    var i = classMembers.size - 1
    do {
        if (i < 0 || i > classMembers.lastIndex){
            return
        }
        println(classMembers[i])
        i -= 1
    } while (i <= classMembers.lastIndex && i >= 0)

}