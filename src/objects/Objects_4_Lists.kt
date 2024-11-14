package objects

import kotlin.random.Random

fun main() {
//    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 108, 9, 10)
//    println(numbers)
//    println(numbers[numbers.size - 1])
//    println(numbers.lastIndex)
//    println(numbers.first())
//    println(numbers.last())
//    println(numbers.take(n=numbers.size/2))
//    println(numbers.indexOf(numbers.size/2))
//    println(numbers.indexOf(108))
//    for (i in numbers){
//        if (i in 150..199){
//            println(i)
//        }
//    }
//    numbers.filter { it in 100..200 }.forEach { println(it) }
//    val test = listOf(1, 2, 3, 4, 5, 6, 7, 108, 9, 10,10,10,10)
//    val result = countOccurrences(list = test,number = 10)
//    println(result)
//    val numbers2 = mutableListOf(3,5,5,1,2,3)
//    println(numbers2)
//    numbers2.add(numbers2.size,5)
//    println(numbers2)
//    println(createList())
    val myList = listOf(1,2,3,4,5)
    println(myList)
    println(myList.contains(1))

}

fun countOccurrences (list: List<Int>,number: Int): String {
    var occurrences = 0
    var item = "item"
    for (i in list) {
        if(i==number) {
            occurrences++
        }
    }
    if (occurrences>1) item = "items"
    return "this list contains $occurrences $item of $number"
}

fun createList(): List<Int> {
    val numbers = mutableListOf<Int>()
    for (number in 0..<10) {
        numbers.add(Random.nextInt(from = 1, until = 100))
    }
    return numbers
}