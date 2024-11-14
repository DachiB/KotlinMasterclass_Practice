package exceptionhandling

// run-time vs compile-time error

//fun main() {
////    errorCode()
////    function3()
////    function4()
//    function5() }
//
//// error reporting
//
//fun errorCode() {
//    throw InvalidNumberException(
//        description = "Enter Valid Number"
//    )
//}
//
//class InvalidNumberException(
//    description: String
//): Exception(description)
//
//// recovery
//
//fun function4() {
//    try {
//        function1()
//    } catch (e: Throwable) {
//        println("Exception: ${e.message}")
//    }
//}
//
//class CustomException(
//    description: String
//):Throwable(description)
//
//fun function1() {
//    throw CustomException(description = "Rand Error")
//}
//
//fun function2() {
//    function1()
//}
//
//fun function3() {
//    function2()
//}
//
//// resource cleanup - executes no matter if it's try or catch
//
//fun function5() {
//    try {
//        function1()
//    } catch (e: Throwable) {
//        println("Exception: ${e.message}")
//    } finally {
//        println("cleanup")
//    }
//}
