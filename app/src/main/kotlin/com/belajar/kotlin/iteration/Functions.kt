package com.belajar.kotlin.iteration

class Functions {
    fun setUser(name: String, age: Int): String {
        return "My name is $name and I'm $age years old."
    }

    fun inlineString(name: String, age: Int): String = "My name is $name and I'm $age years old."

    fun inlineStringImplicit(name: String, age: Int) = "My name is $name and I'm $age years old."

    fun printStringImplicit(name: String, age: Int): String {
        return "My name is $name and I'm $age years old."
    }

    fun printUser(name: String) {
        println("My name is $name.")
    }

    fun getFullName(first: String, second: String, third: String): String {
        return "$first $second $third"
    }

    fun getFullNameAlreadyDefine(
        first: String = "Aku",
        second: String = " tidak akan ",
        third: String = "menyerah."
    ) : String {
        return "$first $second $third"
    }

    fun setNumbers(vararg number: Int): Pair<Int, Int> {
        val sum = number.sum()
        val size = number.size
        return Pair(sum, size)
    }
}

fun main() {
    println(Functions().setUser(name = "Admin", age = 17))
    println(Functions().inlineString(name = "Miaw", age = 18))
    println(Functions().inlineStringImplicit(name = "Meow", age = 19))
    val user = Functions().printStringImplicit("Rawrrr", 20)
    println(user)
    println(Functions().printUser("Kukuruyukkk"))

    // posisi argumen bisa diubah
    val fullName = Functions().getFullName(first = "Semangat", second = " untuk ", third = "hidup!")
    println(fullName)

    val fullNameAlreadyDefine = Functions().getFullNameAlreadyDefine()
    println(fullNameAlreadyDefine)

//    vararg
    val (sum, size) = Functions().setNumbers(10, 15, 20, 25)
    println("Sum: $sum, Size: $size")
}