package usability


//fun main() {
//    val car = Car(tires = Tires(size =13))
//    val car2 = Car(tires = 18)
//    println(car2.getValue())
//    val vehicle = Vehicle(value = Car())
//    val car = vehicle.getValue()
//    val result = car.start()
//    println(result)
//    val result = getName(name = "Dachi")
//    println(result)
//    val result2 = Vehicle(Car())
//    val car = result2.getValue()
//    println(car.start())
//}
//
//fun <T> getName(name: T): T = name
//data class Tires(val size: Int)
//
//class Car(private val tires: Tires) {
//    fun getValue() = tires
//}

//class Vehicle(private val value: Any) {
//    fun getValue() = value
//}

class Vehicle<T>(private val value: T) {
    fun getValue(): T = value
}

class Car {
    fun start() = "Starting the engine"
}

//data class Tires(val size: Int)
//
//class Car<T>(private val tires: T) {
//    fun getValue() = tires
//}