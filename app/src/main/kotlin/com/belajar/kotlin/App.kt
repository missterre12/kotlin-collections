package com.belajar.kotlin

import com.belajar.kotlin.iteration.BooleanLearn

fun main() {
    val booleanLearn = BooleanLearn ()

    println("Class is open: ${booleanLearn.conjunctionOperator()}")
    println("Class is closed: ${booleanLearn.isClose}")
    println(booleanLearn.negationOperator())
}