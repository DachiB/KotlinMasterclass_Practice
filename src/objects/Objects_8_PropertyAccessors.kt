package objects

fun main() {
    val person = Person()
    println(person.age)
    person.addAge(newAge = 10)
    println(person.age)
}

class Person {
    var age: Int = 0
        private set
    fun addAge(newAge: Int) {
        age = newAge
    }
}

//class Person(var age: Int) {
//    val isMinor
//        get() = age < 18
//}

//class Person {
//    private var access =0
//    val age:Int
//        get() = ++access
//}

//class Person {
//    var age: Int = 0
//        get() {
//            return field
//        }
//        set(value) {
//            field = value
//        }
//}