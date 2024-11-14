package oop

//fun main() {
//    val airport = Airport("ENG")
//    val plane = Airport.Plane()
//    plane.contact(airport)
//    val privatePlane = Airport.PrivatePlane()
//
//    val result = airport.privatePlane2(privatePlane)
//
//    val myTicket = Ticket("Dachi", Ticket.SeatType.Eco)
//    myTicket.printSeat()
//    myTicket.upgrade()
//    myTicket.printSeat()
//}
//
//class  Airport(private val code: String) {
//    open class Plane {
//        fun contact(airport: Airport) {
//            println(airport.code)
//        }
//    }
//     class PrivatePlane: Plane() {
//        fun secretCode() {
//            println("Secret code")
//        }
//    }
//    fun privatePlane(): Plane = PrivatePlane()
//    fun privatePlane2(privatePlane: PrivatePlane) {
//        privatePlane.secretCode()
//    }
//}
//
//fun myFunction() {
//    open class Programmer
//    class Kotlin: Programmer()
//    val programmer: Programmer = Kotlin()
//}
//
//interface Person {
//    val height:Height
//    data class Height(val cm:Int)
//}
//
//class John(height: Int): Person {
//    override val height = Person.Height(height)
//}
//
//class Ticket (
//    private val name: String,
//    private var seat: SeatType
//) {
//    enum class SeatType {
//        Eco,
//        Premium,
//        Business,
//        First
//    }
//    fun upgrade() {
//        seat = SeatType.entries.toTypedArray()[seat.ordinal + 1]
//    }
//    fun printSeat() {
//        println("hi $name, your seat is $seat")
//    }
//}