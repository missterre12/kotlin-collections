package com.belajar.kotlin.iteration

class Arrays {
    val arraySingle = arrayOf(1, 3, 5, 7)
    val arrayMix = arrayOf(2, 4, 6, 8, "Trial", true)

    val intArray = intArrayOf(1, 2, 3, 4, 5, 6)
    val booleanArray = booleanArrayOf(true, false, false)
    val charArray = charArrayOf('a', 'b', 'c')
    val longArray = longArrayOf(100L, 200L, 300L)
    val shortArray = shortArrayOf(10, 20, 30)
    val byteArray = byteArrayOf(5, 10, 15)

    fun printArrays() {
        println(arrayMix[5])
        println(arraySingle.joinToString())
        println(arrayMix.joinToString())
        println(intArray.clone().joinToString())
        println(booleanArray.reversedArray().joinToString())
        println(charArray.hashCode())
        println(longArray.joinToString())
        println(shortArray.joinToString())
        println(byteArray.joinToString())
    }
}

fun main() {
    Arrays().printArrays()
}