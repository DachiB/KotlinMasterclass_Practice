package oop

//fun main() {
//    val hdd = Computer("Dell").HardDrive(256)
//    hdd.getComputerModel()
//    hdd.getInfo()
//    hdd.Storage().getInfo()
//}
//
//open class Computer(private val model: String) {
//    open inner class HardDrive(private val size: Int) {
//        open var storageModel:String = model
//        fun getComputerModel() {
//            println(this@Computer.model)
//        }
//        fun getInfo() {
//            println("Computer: $model, Storage: ${size}GB")
//        }
//        inner class Storage(private val system: Int = 10) {
//            fun getInfo() {
//                println("Current Capacity: ${this@HardDrive.size - system} GB")
//            }
//        }
//    }
//}
//
//class Laptop(
//    private val model: String,
//    private val hddSize: Int,
//    private val storageModel: String,
//): Computer(model = model) {
//    inner class Storage: Computer.HardDrive(size = hddSize) {
//        override var storageModel = this@Laptop.storageModel
//    }
//}