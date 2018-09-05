package com.example.anilreddy.dinnerdecider

fun main(args: Array<String>) {

    val price = 150;
    val accBal = 100;

    if (accBal >= price) {
        println("Buy")
    } else {
        println("Cannot Buy")
    }

    val x = 4
    when (x) {
         1 -> print("x = 1")
         2 -> print("x = 2")
         else -> print("x is not equals to 1 or 2")
    }
}