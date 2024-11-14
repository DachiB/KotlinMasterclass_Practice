package usability
import kotlin.random.Random

//fun main() {
////    when(Random.nextInt(from = 1, until = 5)) {
////        1 -> {
////            println("One")
////        }
////        2 -> {
////            println("Two")
////        }
////        else -> println("mane")
////    }
//
////    val result = when(Random.nextInt(from = 1, until = 5)) {
////        1 -> {
////            1
////        }
////        2 -> {
////            2
////        }
////            else -> "mane"
////    }
////    println(result)
//
////    when(getPerson2()) {
////        is Person2.Male -> {
////            println("male")
////        }
////        is Person2.Female -> {
////            println("female")
////        }
////    }
//
//    val number = listOf(1,2,3,4,5)
//    for (n in number) {
//        when (n) {
//            1 -> println("One")
//            2 -> println("Two")
//            3 -> println("Three")
//            4 -> break
//            5 -> println("Five")
//        }
//    }
//}
//
//fun getPerson2(): Person2 {
//    return if (Random.nextInt(from = 1 , until = 3) == 1) Person2.Male else Person2.Female
//}
//
//sealed class Person2 {
//    object Male: Person2()
//    object Female: Person2()
//}