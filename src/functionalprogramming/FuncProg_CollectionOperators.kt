package functionalprogramming

//fun main() {
//    val list1 = List(size = 10) {it}
//    val list2 = MutableList(size = 10) {it}
//    println(list1)
//    println(list2)
//
//    val numList = listOf(1, 2, 3, 4, 5)
//    println(numList.filter { number ->
//       number >= 3
//   })
//
//    val numList2 = listOf(1,2,3,4,4,4,4,5)
//    println(numList2.filter { number ->
//        number > 1
//    })
//    println(numList2.filterIndexed { index, number ->
//        index == 0
//    })
//    println(numList2.filterNot { it == 1 }) // filter values except this
//    println(numList2.filterNotNull()) // show only non-nulls
//    println(numList2.count {number ->
//        number == 4
//    })
//    val result = numList2.count {number ->
//        number == 4
//    }
//    println("count is $result")
//    println(numList2.find { it == 5 })
//    println(numList2.any())
//    println(numList2.any { it == 5 })
//    println(numList2.all { it ->
//        it == 5
//    })
//    println(numList2.none() { it > 5 })
//
//    val (match, noMatch) = numList2.partition { it > 3 }
//    println("$match, $noMatch")
//
//    val randNums = listOf(1,2,3,4,5)
//    println(randNums.reduce { a, b -> a * b })
//
//    val personList = listOf(
//        Person("Dachi", 26),
//        Person("Gucci", 27),
//        Person("Mane", 28),
//    )
//    println(personList.sumOf { person -> person.age })
//    println(personList.sortedBy { person -> person.name })
//    println(numList2.take(n=2))
//    println(numList2.drop(n=2))
//}
//
//data class Person (
//    val name: String,
//    val age: Int
//)