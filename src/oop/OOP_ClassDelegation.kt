package oop

//fun main() {
//    val freelancer = FreelanceProgrammer()
//    freelancer.work()
//    freelancer.getPaid()
//    val freelancer2 = FreelanceProgrammer2(programmer = KotlinProgrammer(amount = 100))
//    freelancer2.work()
//    freelancer2.getPaid()
//    val freelancer4 = Freelancer4()
//    freelancer4.work()
//
//}
//
//interface Programmer {
//    var working: Boolean
//    fun work()
//    fun getPaid()
//}
//
//interface Designer {
//    var designing: Boolean
//    fun design()
//    fun getMoney()
//}
//
//class KotlinProgrammer(private val amount:Int) : Programmer {
//    override var working: Boolean = false
//    override fun work() {
//        println("Programming with Kotlin...")
//        working = true
//    }
//    override fun getPaid() {
//        if (working) println("Getting the bag!: $$amount") else println("Not Working!")
//        working = false
//    }
//}
//
//class JavaDeveloper(private val amount:Int) : Programmer {
//    override var working: Boolean = false
//    override fun work() {
//        println("Programming with Kotlin...")
//        working = true
//    }
//    override fun getPaid() {
//        if (working) println("Getting the bag!: $$amount") else println("Not Working!")
//        working = false
//    }
//}
//
//class GraphicDesigner(private val amount:Int) : Designer {
//    override var designing: Boolean = false
//    override fun design() {
//        println("Designing...")
//        designing = true
//    }
//    override fun getMoney() {
//        if (designing) println("Getting the bag!: $$amount") else println("Not Working!")
//        designing = false
//    }
//}
//
//
//
////პირველი გზა
//class FreelanceProgrammer : Programmer by KotlinProgrammer(amount = 25)
//
////მეორე გზა
//class FreelanceProgrammer2(programmer: Programmer) : Programmer by programmer {
//    override fun getPaid() {
//        println("You're not getting paid this month")
//    }
//}
//
////class FreelanceProgrammer3: // error: A supertype appears twice
////        Programmer by KotlinProgrammer(amount = 50),
////        Programmer by JavaDeveloper(amount = 50) {}
//
//class Freelancer4:
//        Programmer by KotlinProgrammer(50),
//        Designer by GraphicDesigner(25)