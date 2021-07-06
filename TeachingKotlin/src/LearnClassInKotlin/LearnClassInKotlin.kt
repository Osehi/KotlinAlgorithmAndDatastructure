package LearnClassInKotlin

open class A() {
    protected var i = 1
}

class B: A() {
    fun getValue(): Int{
        return i
    }
}

fun main(){
    var oneOfClassA = A()

}