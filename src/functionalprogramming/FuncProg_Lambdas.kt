package functionalprogramming

import kotlin.random.Random

//fun main() {
//    val nums = listOf(1,2,3)
//    val quotedNums = nums.map { number ->
//    "\"$number\""
//    }
//    val quotedNums = nums.map {number -> "\"$number\""}
//    println(quotedNums)
//
//    val quotedNums2 = nums.joinToString(separator = ", ") {
//        number -> "\"$number\""
//    }
//    println(quotedNums2)
//
//    val quoted = { number: Int -> "\"$number\"" }
//    val quotedNums3 = nums.joinToString (transform = quoted)
//    println(quotedNums3)
//    val quotedNums4 = nums.mapIndexed { _, num ->
//        "$num"
//    }
//    lambdaTaker(onClick = {
//        println("Clicked")
//    })
//    lambdaTaker {
//        println("Mane")
//    }
//    lambdaTaker2 { random ->
//        println("$random")
//        "$random"
//    }
//}
//
//fun lambdaTaker(onClick: () -> Unit){
//    onClick()
//}
//
//fun lambdaTaker2(onClick: (Int) -> String){
//    onClick(Random.nextInt(from = 1, until = 5))
//}