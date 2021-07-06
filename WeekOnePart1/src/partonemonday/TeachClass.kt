package partonemonday

import java.lang.ClassCastException

fun main(){

 val friends = listOf<String>("kola", "Hope","Ehijie")

    val sportTeam = mutableMapOf<String, String>("one" to "Nigeria", "two" to "USA")

    sportTeam["three"] = "UK"
    println(sportTeam)
    val grade = setOf('a', 'b', 'c')



}

fun String.lengthOfAString():Int {
    return this.length
}