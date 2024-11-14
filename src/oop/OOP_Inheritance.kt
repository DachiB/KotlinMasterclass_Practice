package oop

//fun main() {
//    val dog = Dog("Babuna")
//    val lion = Lion("Gocha The Lion")
////    println("${dog.name}, ${dog.printEnergy()}")
////    dog.eat()
////    println(dog.printEnergy())
////    dog.updateColor("brown")
////    println(dog.color)
//    dog.updateColor("brown")
//    println(dog.printColor())
//    val lion1 = Lion1()
//    println(lion1.name)
//}
//
//open class Cat(catName: String):Animal(name = catName) {
//}
//
//class Lion1:Cat("Gocha The Lion"){
//
//}
//
//open class Animal(open val name: String) {
//    protected var energy = 0
//    var color = "black" //defaults
//    fun printColor():String {
//        return "Current Color: $color"
//    }
//
//    init {
//        println("Animal class init...")
//    }
//
//    fun printEnergy(): String {
//        return "Current Energy: $energy"
//    }
//    open fun eat() {
//        energy++
//    }
//    open fun run(){
//        energy--
//    }
//}
//
//class Dog(name: String) : Animal(name) {
//    init {
//        println("$this class init...")
//    }
//}
//
//class Lion(name: String) : Animal(name = name) {
//    init {
//        println("$this class init...")
//    }
//    override fun eat() {
//        energy += 10
//    }
//    override fun run() {
//        energy -= 10
//    }
//}
//
////extension function
//fun Animal.updateColor(color: String) {
//    this.color = color
//}
//
////open class Parent
////class Child: Parent()