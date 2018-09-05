package com.example.anilreddy.dinnerdecider

fun main(args: Array<String>) {

    val cars = hashMapOf("1" to "Honda", "2" to "TATA", "3" to "Hundai", "4" to "Benz", "5" to "BMW")
    for(car in cars){
        println(car)
    }

    for ((key, value) in cars){
        println("The Key is $key & The Value is $value")
    }
}