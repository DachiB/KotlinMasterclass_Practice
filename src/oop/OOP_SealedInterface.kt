package oop

fun main() {

}

sealed interface NetworkStatus

data object Available: NetworkStatus
data object Unavailable: NetworkStatus