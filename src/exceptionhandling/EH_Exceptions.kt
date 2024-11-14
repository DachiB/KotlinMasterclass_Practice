package exceptionhandling

import java.time.Month

//fun main() {
//    errorCode()
//    val result = averageSalary(135000,12)
//    val result2 = averageSalary2(135000,12)
//    val result3 = averageSalaryOrException(0,12)
//
//    println(result)
//    println(result2)
//    println(result3)
//}
//
//fun errorCode () {
//    val invalidNumber = "1"
//    val result = invalidNumber.toInt()
//    println(result)
//}
//
//fun averageSalary(amount: Int, month: Int): Int {
//    return amount / month
//}
//
//fun averageSalary2(amount: Int, month: Int): Comparable<*> {
//    return if (amount == 0 || month == 0) "Invalid Argument" else amount / month
//}
//
//fun averageSalaryOrException(amount: Int, month: Int): Int {
//    if (amount == 0 || month == 0 ) {
//        throw IllegalArgumentException("Invalid Argument")
//    } else {
//        return amount / month
//    }
//}