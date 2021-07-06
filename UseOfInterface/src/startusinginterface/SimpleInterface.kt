package startusinginterface

interface SimpleInterface {

    val firstProp:String // this is an abstract property

    val secondProp:String // this has an accessor
        get() = "Second Property"

    // abstract method
    fun firstMethod():String

    // default method
    fun secondMethod():String {
        return ("Hello, World!")
    }

}