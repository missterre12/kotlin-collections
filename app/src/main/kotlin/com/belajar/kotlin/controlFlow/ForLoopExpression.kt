package com.belajar.kotlin.controlFlow

class ForLoopExpression {
    val ranges = 1..20
    val rangesStep = 1.rangeTo(10) step 3

    fun getForLoop() {
        for (i in ranges) {
            println("value is $i")
        }
    }

    fun getRangesStep() {
        for ((index, value) in rangesStep.withIndex()) {
            println("value $value with index $index")
        }
    }

    fun getForEach() {
        rangesStep.forEach { value ->
            println("value is $value!")
        }
    }

    fun getLabel() {
        loop@ for (i in 1..10) {
            println("Outside loop")

            for (j in 1..10) {
                println("Inside loop")
                if (j > 5) break@loop
            }
        }
    }

    fun getReturn(): String {
        return "Office"
    }
}

fun main() {
    ForLoopExpression().getForLoop()
    ForLoopExpression().getRangesStep()
    ForLoopExpression().getForEach()
    ForLoopExpression().getLabel()
    ForLoopExpression().getReturn()
}