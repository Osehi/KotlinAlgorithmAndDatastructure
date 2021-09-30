package howclasseswork

class Constants {

    companion object {
        const val BASE_URL = "http://www.registeredusers.com/"
    }

}

interface APIUser {
    fun getUsers():Nothing

    // doing something like this is wrong.
    // because you cannot create an instance of an interface.
    // that it worked doesnot make it right.
    companion object {
        const val RESET = "reset"
    }
}

/**
 * in create an instance of a service that will make a network call to a webservice; the following must be created
 * 1. an interface.
 * 2. an instance of retrofit
 * 3. the retrofit service.
 */



fun main(){
    val content = Constants.BASE_URL
    println(content)



}