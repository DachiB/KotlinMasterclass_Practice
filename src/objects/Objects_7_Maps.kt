package objects

fun main(){
    val animals = mapOf(
        "Monkey" to "brown",
        "Tiger" to "orange",
        "Whale" to "blue"
    )
//    for (item in animals) {
//        println("${item.key} is ${item.value}")
//    }
//    for ((x,y) in animals){
//        println(x)
//        println(y)
//    }
//    animals.forEach { (key, value) -> println("$key -> $value")}
//    println(animals.getOrDefault(key = "Dog", defaultValue = "Black"))

//    val filteredMap = animals.filter { item -> item.key.length > 5 }
//    println(filteredMap)
//
//    val animalList = listOf("Monkey", "Tiger", "Whale")
//    println(animalList.associateBy { it })

    val monkey = Animal("monkey",13)
    val tiger = Animal("tiger",25)
    val whale = Animal("whale",210)
    val animalList = listOf(monkey, tiger, whale)
    val animalMap = animalList.associateBy({it.names},{it.age})
    println(animalMap)
}

class Animal(
    val names:String,
    val age:Int,
)