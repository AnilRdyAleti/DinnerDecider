package com.example.anilreddy.dinnerdecider

fun main(args: Array<String>) {

    //immutable list in kotlin
    val names = listOf("Manish", "Anil", "Arun", "Manish", "Tanish", "Kumar")

    println(names.sorted())
    println(names[2])
    println(names.contains("Vamshi"))

    //mutable list
    val name = arrayListOf("Anil", "Arun", "Manish", "Tanish", "Kumar")

    println(name.add("Suresh"))
    println(name[4])
    println(name.contains("Vamshi"))

    //immutable map
    val mapNo = mapOf("ph.no.1" to "111", "ph.no.2" to "112", "ph.no.3" to "113")
    println(mapNo.entries)
    println(mapNo.get("ph.no.1"))
    println(mapNo["ph.no.2"])

    //mutable map
    val hashNo = hashMapOf("ph.no.1" to "111", "ph.no.2" to "112", "ph.no.3" to "113")
    println(hashNo.entries)
    println(hashNo.get("ph.no.1"))
    println(hashNo["ph.no.2"])
    hashNo.put("ph.no.4","114")
    println(hashNo)
    hashNo.remove("ph.no.2")
    println(hashNo)
}