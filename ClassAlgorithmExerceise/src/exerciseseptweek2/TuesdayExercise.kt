package exerciseseptweek2

fun main(){
    twoSum(intArrayOf(2,7,11,15), 9)
}

fun twoSum(nums:IntArray, target:Int):IntArray{
    var indexOfInt = arrayListOf<Int>()
    for (i in 0 until nums.size - 1){
        if ((nums[i] + nums[i + 1]) == target){
            indexOfInt.add(i)
            indexOfInt.add(i + 1)

        }
    }
    return indexOfInt.toIntArray()
}

fun manipulateMap(){
    var list = mutableMapOf<Int, Int>()
    
}