package oop

//singletons

//fun main() {
//    Singleton.printName()
//    increment()
//}
//
//private object Singleton {
//    fun printName() {
//        println("hi my name is Stefan")
//    }
//}
//
//open class Person(private val name: String) {
//    open fun printName() {
//        println("my name is $name")
//    }
//}
//
//interface Worker {
//    fun getToWork() {
//        println("mane")
//    }
//}
//
//object John:Person("John"), Worker {
//    override fun printName() {
//        super.printName()
//    }
//
//    override fun getToWork() {
//        super.getToWork()
//    }
//}
//
//object Counter {
//    private var count = 0
//    fun current() = count
//    fun increment() = ++count
//}
//
//fun increment() {
//    Counter.increment()
//}
//
//object OuterObject {
//    object NestedObject {
//
//    }
//}
//
//class OuterClass {
//    object NestedObject {
//
//    }
//}