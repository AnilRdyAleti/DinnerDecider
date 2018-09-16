package com.example.anilreddy.dinnerdecider

fun main(args: Array<String>){
    val car = Car("BMW","2018", "Black")
    println("The car is ${car.name}, ${car.model} and it's color is ${car.color}")
    car.accelerate()
    car.park()
    car.brake()
}

open class Vehicle(val name: String, val model: String) {

   open fun accelerate() {
        println("Double Speed..........")
    }

    fun park() {
        println("Park the Vehicle.")
    }

    fun brake() {
        println("STOP")
    }
}

class Car(name: String, model: String, var color: String) : Vehicle(name, model) {

    override fun accelerate() {
        println("car accelerate")
    }

}

class Track(name: String, model: String, var towingCapacity: Int, var color: String) : Vehicle(name, model) {

}