package usingabstractconcept

abstract class Person(name:String) {

    fun displaySSN(ssn:Int){
        println("My SSN is $ssn")
    }

   abstract fun displayJob(description:String)

}