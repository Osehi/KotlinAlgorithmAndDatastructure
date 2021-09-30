
class Room {

    private val mix = Cement()

    

}

class Cement {

    fun build(){

    }
}

class Car {
    private val engine = Engine()

    fun start(){
        engine.start()
    }
}

class Engine {
    fun start(){

    }
}

fun main(){
    val car = Car()
    car.start()
}