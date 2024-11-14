package oop

//fun main() {
//    val dog = Dog()
//    val robot = CleaningRobot()
//    val cleaningRobotDog = CleaningRobotDog(dog = dog, cleaningRobot = robot)
//    cleaningRobotDog.run()
//
//}
//
//interface Animal {
//    fun eat()
//    fun run()
//}
//
//open class Dog: Animal {
//    override fun eat() {}
//    override fun run() {
//        println("Running")
//    }
//    open fun bark() {}
//}
//
//class Cat: Animal {
//    override fun eat() {}
//    override fun run() {}
//    fun hiss() {}
//}
//
//interface Robot {
//    fun move()
//}
//
//open class CleaningRobot: Robot {
//    override fun move() {}
//    open fun clean() {}
//}
//
//class ServiceRobot:Robot {
//    override fun move() {}
//    fun repair() {}
//}
//
////class CleaningRobotDog: Animal, Robot, Dog() {
////    override fun bark() {
////        super.bark()
////    }
////    override fun eat() {}
////    override fun run() {}
////    override fun move() {}
////}
//
//class CleaningRobotDog(private val dog : Dog, private val cleaningRobot : CleaningRobot) {
//    fun run() {
//        dog.run()
//    }
//    fun move() {
//        cleaningRobot.move()
//    }
//    fun bark() {
//        dog.bark()
//    }
//    fun clean() {
//        cleaningRobot.clean()
//    }
//}
//
//class Parent {
//    fun getFood() {
//        println("getting food..")
//    }
//}
//
//class Child(){
//    private val parent = Parent()
//    val getFood = parent.getFood()
//}