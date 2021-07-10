package LearnClassInKotlin

import org.junit.Assert.*
import org.junit.Before

class PersonTest {

    lateinit var kolade:Person

    // get an instance of the class
    // I'll declare a variable
    @Before
    fun start(){
         kolade = Person("Kolade", "Great", 23)
    }

    @org.junit.Test
    fun getFirstName() {
        // Given; instance of kolade is given
        // when; the action carried out is calling the object
       val result = kolade.getFirstName()
        // assert
        assertEquals("kolade", result)

    }

    @org.junit.Test
    fun drives() {
        val output = kolade.drives()
        assertEquals("I drive to office", output)
    }
}