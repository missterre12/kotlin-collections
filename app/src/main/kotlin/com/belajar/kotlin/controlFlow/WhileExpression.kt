package com.belajar.kotlin.controlFlow

class WhileExpression {
    var counter = 1

    fun getWhile() {
        while (counter <= 7) {
            println("Hello, Kotlin!")
            counter++
        }
    }
}

fun main() {
    WhileExpression().getWhile()
}