package model//fun main() {
////    val elements = listOf("A", "B")
////    for (item in elements) {
////        println("Current Element: $item")
////    }
////
////    for (number in 1..3) {
////        println("Number is $number")
////    }
////    val range1 = 1..10
////    val range2 = 1 until 10
////    println(range1)
////    println(range2)
////    showRange(range = 1..10)
//    repeat(times = 3) {
//        println("Mane")
//    }
//}
//
//fun showRange(range: IntProgression) {
//    for (number in range) {
//        println("current number: $number")
//    }
//    print("// $range")
//}

//fun main() {
////    val string = "Kotlin Masterclass"
////    println('t' in string)
//    println(isDigit('z'))
//    println(isNotDigit('z'))
//    println(isLower(ch = 'a'.uppercaseChar()))
//    println(isUpper(ch = 'A'))
//}
//
//fun isDigit(ch: Char) = ch in 'a'..'z'
//fun isNotDigit(ch: Char) = ch !in 'a'..'z'
//
//fun isLower(ch: Char) = ch in 'a'..'z'
//fun isUpper(ch: Char) = ch in 'A'..'Z'

fun main() {
    println(bigger(a = 5, b = 6))
    val result = unitFun()
    
}

fun unitFun() = Unit
fun bigger(a: Int, b: Int) = if (a > b) a else b