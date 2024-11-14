package functionalprogramming

fun main() {
//    val list = listOf(1,10,100,1000,10000)
//    val result = list.fold(initial = 0) {sum, num ->
//        println("sum = $sum, num = $num")
//        sum + num
//    }
//    println("Final result = $result") // იგივე რაც reduce, ოღონდ reduce- არ ჭირდება initial =  value

    val list = listOf(1,10,100,1000,10000)
    val result = list.fold(initial = 0) {sum, num ->
        println("sum = $sum, num = $num")
        sum + num
    }
    println("Final result = $result")

}

fun foldReplica(){
    val list = listOf(1,10,100,1000,10000)
    var accumulator = 0
    val operation = {sum: Int, num:Int -> sum + num}
    for (num in list) {
        accumulator = operation(accumulator, num)
    }
    println(accumulator)
}