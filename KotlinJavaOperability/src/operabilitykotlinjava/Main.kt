package operabilitykotlinjava

// https://www.baeldung.com/kotlin/java-interoperability

class Main {

    fun main(){
        val one = Customer("grace", "peace",23)
        println(one.age)
    }
}