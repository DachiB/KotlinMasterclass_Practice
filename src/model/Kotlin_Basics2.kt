package model
////fun main() {
////    val num = 10
////    val favNum = "My Fav num is: ${num.toFloat()}"
////    println(favNum)
////}
////
////fun setAge(age: Int) {
////    println(if (age < 18) "Minor" else "Adult")
////}
//
//fun main() {
//    val about = "lorem ipsum\n" +
//            "dolor sit amet"
//    val about1 = """lorem ipsum ndolor sit amet
//        |we are going
//        |to the store
//    """.trimMargin()
//    println(about)
//}

//fun main() {
//    var num = 0
//    while (condition(num = num)) {
//        println(num)
//        num += 10
//    }
//}
//
////fun condition(num: Int): Boolean {
////    return num <= 10
////}
//

fun main() {
    display(str = "Mane")
}

//accept string param, need while for printing each character
fun display(str: String) {
    var i = 0
    while (condition(i, str)) {
        println(str[i])
        i++
    }
}

fun condition(num: Int, str: String) = num < str.length