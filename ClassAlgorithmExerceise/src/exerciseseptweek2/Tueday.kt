package exerciseseptweek2

// Question: https://app.codility.com/programmers/trainings/4/first_unique/
fun main(){
    getUniqueInteger()
}

/**
 * output : give me all the unique elememts
 *
 * filter or separate elememts that occur more than onces
 * get elements that occur once.
 * you can use group-by
 *
 * input
 * an array of integers.
 *
 * a. create an empty map.
 * b. check if the key of the map exit
 * if true, increment count
 * if false, assign count
 * array element become key of the map
 * the number of occurence become a value
 */

fun getUniqueInteger(){
    var positionOfUniqueElement = arrayListOf<Int>()
    var uniqueElement = arrayListOf<Int>()
    var sortInteger = mutableMapOf<Int, Int>()
    val list = arrayOf(1, 4, 3, 3, 1, 2)

     list.map {element ->
        // is this element containec in the sortInteger?
        if (!sortInteger.containsKey(element)){
            sortInteger.put(element, 1)
        } else {
            sortInteger.put(element, sortInteger.getValue(element) + 1)
        }
    }
    println(sortInteger)
    for ((key, value) in sortInteger.entries){
        if (value == 1){
            uniqueElement.add(key)
        }
    }

    println(uniqueElement)

    // check the position of the unique element
//    for (item in 0 until list.size){
//        // get the lowest position
//        list.indexOf()
//    }

    for (item in uniqueElement){
        positionOfUniqueElement.add(list.indexOf(item))
    }

    println(positionOfUniqueElement.minOrNull())
    println(list[positionOfUniqueElement.minOrNull()!!])

}