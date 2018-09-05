package com.example.anilreddy.dinnerdecider

fun main(args: Array<String>) {
    val str = "Kotlin"

    print("The new language for Android Development is \'$str\'\n")

    val rawString = """ |Hello this is Kotlin
        |The new Language to Android Development
        |It is very easy to learn and code
        |The Kotlin is very cool it will reduce the coding length,
        |increase the performance of the application.""".trimMargin()

    print(rawString)

    print("\n " + str.contentEquals(rawString))

    var name = "Hello"
    print("\n " + name.toUpperCase())
    print("\n " + name.toLowerCase())
    print("\n " + name.subSequence(1,3))
    print("\n " + name.substring(2,3))


}
