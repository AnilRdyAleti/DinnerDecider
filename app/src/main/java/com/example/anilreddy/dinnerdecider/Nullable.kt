package com.example.anilreddy.dinnerdecider

fun main(args: Array<String>) {

    var name: String = "Anil"
    //name = null;

    var car: String?
    // car = null
    // println(car!!.length)


    car = "Benz"
    println(car!!.length)

    println("The Name of Car is $car")

    //Normal Checking
    var length = 0
    if (car != null) {
        length = car.length
    } else {
        length = -1
    }

    //Advanced if else
    val l = if (car != null) car.length else -1

    //elvis expression
    val len = car?.length ?: -1

    println(length);
    println(l);
    println(len);
}
