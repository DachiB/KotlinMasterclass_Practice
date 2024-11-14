package oop

//fun main() {
//    val dog = Dog(name = "Babi")
//    val dog2 = Dog(name = "Balto")
//    val cat = Cat(name = "Kiwi")
//    val cat2 = Cat(name = "Kat")
//
////    getAnimal(animal = dog)
////    getAnimal(animal = cat)
////    getAnimal2(dog)
////    getAnimal3(cat)
////    getAnimal5(cat)
//    val animals = listOf(dog, cat, dog2, cat2)
////    val result = animals.find { it is Dog } as? Dog
////    println(result?.name)
//    val result = animals.filterIsInstance<Dog>()
//    val list = result.map { it -> it.name }
//    println(list)
//}
//
//fun getAnimal(animal : Animal){
//    animal.eat()
//}
//
//fun getAnimal2(animal : Animal){
//    if(animal is Dog) {
//        animal.fetchABall()
//    }
//}
//
//fun getAnimal3(animal : Animal){
//    when(animal){
//        is Dog -> animal.fetchABall()
//        is Cat -> animal.scratch()
//    }
//}
//
//fun getAnimal4(animal : Animal){
//    val dog = animal as Dog
//    dog.fetchABall()
//}
//
//fun getAnimal5(animal : Animal){
//    val dog = animal as? Dog
//    dog?.fetchABall()
//}
//
//interface Animal {
//    fun eat()
//    fun run()
//}
//
//class Dog(val name: String) : Animal {
//    override fun eat() {
//        println("${this::class.qualifiedName} is eating...")
//    }
//
//    override fun run() {
//       println("${this::class.qualifiedName} is running...")
//    }
//
//    fun fetchABall() {
//        println("Fetching A Ball...")
//    }
//}
//
//class Cat(val name: String) : Animal {
//    override fun eat() {
//        println("${this::class.qualifiedName} is eating...")
//    }
//    override fun run() {
//        println("${this::class.qualifiedName} is running...")
//    }
//    fun scratch() {
//        println("Scratching...")
//    }
//}
