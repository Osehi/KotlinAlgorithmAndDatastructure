package LearnClassInKotlin

// Things to do today
//  access all the properties.
// how do you inherit the method from the parent class
//  add additional property to the student class.
//  add modifier "private"
//  access the properties.
//

open class Person(
        private val firstName:String,
        private val lastName:String,
        private val age:Int
){

    fun getFirstName():String {
        return firstName
    }

    open fun drives(){
        println("I drive to office")
    }

}

class Student(firstName: String, lastName: String, age: Int, var idNo:String): Person(firstName, lastName, age) {

    override fun drives() {
//        super.drives()   // this means an instance of the parent class calling the method in the parent class.
        println("I drive to school")
    }

}

fun main(){
    val onePerson = Person("Kola", "Ibrahim", 21)
//    println(onePerson.drives())
//    println(onePerson.getFirstName())
//    onePerson.drives()

    // create an instance of student
    val firstStudent = Student("Osehi", "Ehilen", 23, "001")
    firstStudent.drives()
    println(firstStudent.getFirstName())
}