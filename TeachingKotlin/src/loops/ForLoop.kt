package loops

fun main(){
//    rangeType()
//    rangeTypeUntil()
//    rangeTypeStep()
//    rangeTypeDownTo()
    printOutTheCountries()
}

fun rangeType(){
    for(number in 0..10){
        println(number)
    }
}

fun rangeTypeUntil(){
    for(number in 0 until 10){
        println(number)
    }
}

fun rangeTypeStep(){
    for(number in 0..10 step 2){
        println(number)
    }
}

fun rangeTypeDownTo(){
    for(number in 10 downTo 0){
        println(number)
    }
}

fun printOutTheCountries(){
    var classMembers = arrayOf("Abass", "Emmanuel", "Ibrahim")
    for (member in 0..classMembers.size - 1){
        println(classMembers[member])
    }
}