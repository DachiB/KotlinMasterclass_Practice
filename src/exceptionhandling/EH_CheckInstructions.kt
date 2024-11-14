package exceptionhandling

//import java.io.File
//
//fun main() {
//    val person = Person("Hob",20)
//    val multiply = multiplyWithTen(12)
//    println(multiply)
//    writeToFile()
//}
//
//fun writeToFile() {
//    val myFile = File("file.txt")
//    check(myFile.exists()) {
//        "File does not exist"
//    }
//    myFile.writeText("Okay")
//}
//
//fun multiplyWithTen(number: Int?): Int {
//    requireNotNull(value = number) {
//        "Invalid number"
//    }
//    return number * 10
//}
//
//data class Person(var name: String, var age: Int) {
//    init {
//        require(value = name.length <= 4) {
//            "Your name is too long"
//        }
//    }
//}