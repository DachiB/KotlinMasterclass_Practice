package usability

fun main() {
// let -
//    val name: String? = "Mane"
//    val length = name?.let {
//        println("name is not null")
//        it.length
//    } ?: 0
//    println("length is: $length")

// run - used to execute a block of code on an object and return the result of that block
//    val person = Person(name = "John", age = 25)
//    val result = person.run {
//        age += 35 //execute code block
//        "Name : $name, Age: $age" // return result
//    }
//    println(result)

// with - operate on an object without the need to refer to it within the block
//    val person = Person(name = "Mane", age = 25)
//    val result = with(person) {
//        age +=35
//        "Name: $name, Age: $age"
//    }

// apply - configure object and return the object itself
//    val person = Person(name = "Mane", age = 25)
//    val result = person.apply {
//        name = "Mary"
//    }
//    println(result)

// also - used for performing additional actions on an object and then returning that as the same object
    val numbers = mutableListOf(1,2,3,4,5)
    val sum = numbers
        .also {item -> println("Original list: $item")}
        .sum()
    println("sum: $sum")
}

data class Person(var name: String, var age: Int) {

}