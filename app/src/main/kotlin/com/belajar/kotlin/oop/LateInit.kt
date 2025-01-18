package com.belajar.kotlin.oop

class LateInit1 {
    var name: String? = null
}

class LateInit2 {
    lateinit var name: String

    fun isNameInitialized(): Boolean {
        return this::name.isInitialized
    }
}

class Lazy {
    val name: String by lazy {
        "My Admin"
    }
}

fun main() {
    val obj = LateInit1()
    obj.name = "Admin Trial"

    println(obj.name?.length ?: "Name is null.")

    val obj2 = LateInit2()
    obj2.name = "Try Admin"
    if (obj2.isNameInitialized()) {
        println(obj2.name.length)
    } else {
        println("Not Initialized")
    }

    val obj3 = Lazy()
    println(obj3.name.length)
}
