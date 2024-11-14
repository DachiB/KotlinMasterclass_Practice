package functionalprogramming

//fun main() {
//    val people = listOf(Person("Alice", 29, true),
//        Person("Bob", 31, false),
//        Person("Carol", 23, false),
//        Person("Sarol", 25, false),
//        Person("Marol", 25, true)
//    )
//    people.filter {person -> person.male}.forEach {
//        println(it.name)
//    }
//    println("---")
//    people.filterNot { person -> person.male }.forEach {
//        println(it.name)
//    }

//    val (males, females) = people.partition { it.male }
//    males.forEach{
//        println(it.name)
//    }
//    females.forEach{
//        println(it.name)
//    }

//    people.filter(Person::male).forEach{println(it.name)}
//    people.filterNot(Person::male).forEach{println(it.name)}

//    people.sortedBy(Person::age).forEach{println(it.name)}
//    println("--")
//    people.sortedByDescending(Person::age).forEach{println(it.name)}
//    println(people.any(Person::important)) // checks if their is an object like that
//    println(people.any(::important2))
//    val names = listOf("Dog", "Cat")
//    println(names.mapIndexed(::Animal))
//}
//
//fun Person.important() = this.name.startsWith("M") && this.age > 20 // function reference with class extension
//
//fun important2(person: Person) =
//    person.name.startsWith("M") && person.age > 20
//
//data class Person (
//    val name: String,
//    var age: Int,
//    val male: Boolean
//)
//
//data class Animal (
//    val id: Int,
//    val name: String
//)