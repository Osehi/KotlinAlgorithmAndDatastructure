package freestyle

enum class RecordingStatus {
    STOP,
    START,
    PAUSE
}

fun main(){
    var count = 1
    println(count.javaClass.name)
    var presentState = RecordingStatus.PAUSE
    println(presentState)
    // findout the type in the variable
}