package com.example.anilreddy.dinnerdecider

fun main(args: Array<String>) {

    fun printString() {
        println("Hello this is Sample Function Examples")
    }

    printString()

    fun printString(line: String) {
        println(line)
    }

    printString("Hello this is a String value")

    fun addNumber(a: Int, b: Int): Int {
        return a + b;
    }

    println(addNumber(5,10))
}