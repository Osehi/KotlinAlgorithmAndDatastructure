package weektwo

fun main(){
    var list = arrayOf(4,3,9,0,1)
    var searchItem = 1
//    println(search(list, searchItem))

    println(searchIt(list, searchItem))

}

fun search(arr:Array<Int>, elem:Int):Int?{
    // Question
    /**
     * in a given array, check if the given element is present in
     * the array. If it is present, return the index of the element
     * else return -1
     */

    // using a brute-force or first thinking approach
    // Given: an an array of type Int; element of type Int
    // access the array through a loop
    for (item in arr){
        // compare to the given element if it is same
        if (item == elem){
            return arr.indexOf(item)
        }
    }
    return -1
    //Output : return -1 or indexOf -the element.
//    return null
}

    fun searchIt(arr:Array<Int>, elem:Int):Int{
// how to improve this code
// using the concept of binary search
// a sorted array is given.
/// is given.....
// find a middle number [1,2,3,4,5,6,7]
    // get middle index
    var middleIndex = arr.size / 2
    var middleNumber = arr[middleIndex]
// check if middle number is the same as the "searched-item"; if true; return indexOf.

        if (middleNumber == elem){
            return arr.indexOf(middleNumber)
        } else if (elem < middleNumber){
            for (item in 0..arr.indexOf(middleNumber)){
                if (elem == item){
                    return arr.indexOf(item)
                }
            }
            // so the range of index will be from zero to middle index
//            middleIndex = middleNumber - (middleIndex/2)
//            return middleIndex
        } else if (elem > middleNumber){
//            middleIndex = middleIndex
            for (item in arr.indexOf(middleNumber)..arr.lastIndex){
                if (item == elem){
                    return arr.indexOf(item)
                }
            }
        }
// check if searched-item < middle number.
// check if search-item > middle number.
        return -1
    }