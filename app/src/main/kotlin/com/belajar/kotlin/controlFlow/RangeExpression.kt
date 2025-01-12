package com.belajar.kotlin.controlFlow

class RangeExpression {
    val rangeInt = 1..10
    val rangeStep = 1..20 step 4
    val rangeNumber = 1.rangeTo(10)
    val downNumber = 10.downTo(1)

    fun getRangeInt() {
        println(rangeInt.step)
    }

    fun getRangeInStep() {
        rangeStep.forEach {
            print("$it ")
        }
        println(rangeStep.step)
    }

    fun getRangeTo() {
        if (8 in rangeNumber) {
            println("value 8 is available")
        }
    }

    fun getDownTo() {
        if (9 in downNumber) {
            println("value 9 is available")
        }
    }
}

fun main() {
    RangeExpression().getRangeInt()
    RangeExpression().getRangeInStep()
    RangeExpression().getRangeTo()
    RangeExpression().getDownTo()
}