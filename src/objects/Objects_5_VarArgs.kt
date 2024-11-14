package objects

fun main() {
val myArr = intArrayOf(1,2,3,4,5)
    println(sum(*intArrayOf(1,2,3,4,5,*myArr)))
}

fun sum(vararg nums:Int):Int {
    var total = 0
    for (num in nums) {
        total += num
    }
    return total
}