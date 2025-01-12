package com.belajar.kotlin.controlFlow

class DoWhileExpression {
    var value = 1

    fun getDoWhile() {
        do {
            print(value)
            value++
        } while (value < 7)
    }
}

fun main() {
    DoWhileExpression().getDoWhile()
}