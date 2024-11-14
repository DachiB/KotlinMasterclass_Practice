package functionalprogramming

import usability.Person

//fun main() {
//    val names = listOf("alice","bob","carol","bill","John")
//    val ages = listOf(21,15,24,25,42)
//    val people = names.zip(ages) { name, age ->
//        People(name, age)
//    }
//    println(people)

//    val map = people.groupBy(People::age) //Map<Int, List<Person>>
//    println(map)
////    val result = map[21]
////    println(result)
//    val map2 = people.associateWith(People::name)
////    println(map2)

//    val map3 = people.associateBy(People::age)
//    println(map3)
//    println(map3)
//    println(map3.keys)
//    println(map3.values)
//    println(map3.getOrElse(key = 21) { 0 })
//
//    val map4 = people.sortedBy { it.age }
//    println(map4)
//
//    val mutableMap = map3.toMutableMap()
//
//    println(mutableMap.getOrPut(key = 210) {
//        People(name="alice12", age=210)
//    })
//    println(mutableMap)
//    val map = mapOf("two" to 2, "three" to 3, "four" to 4)
//    println(map.filterKeys { it.startsWith("f") })
//    println(map3.map { (_, value) ->
//        "\"${value.name}\" = \"${value.age}\""
//    })
//    map3.mapValues { (_, value) ->}
//}
//
//data class People (
//    val name: String,
//    val age: Int
//)