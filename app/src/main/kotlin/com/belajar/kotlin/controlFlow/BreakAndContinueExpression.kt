package com.belajar.kotlin.controlFlow

class BreakAndContinueExpression {
    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)

    fun getBreak() {
        for (i in listOfInt) {
            if (i == null) break
            println(i)
        }
    }

    fun getContinue() {
        for (i in listOfInt) {
            if (i == null) continue
            println (i)
        }
    }
}

fun main() {
    BreakAndContinueExpression().getBreak()
    BreakAndContinueExpression().getContinue()
}