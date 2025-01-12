package com.belajar.kotlin.controlFlow

import kotlin.random.Random

class WhenExpression {
    val value = 5
    val ranges = 10..100
    val anyType : Any = 100L

    fun getValue() {
        when(value) {
            4 -> {
                var firstName = "Admin"
                var lastName = "Cool"

                println("$firstName $lastName")
            }
            5 -> {
                println("five")
            }
            6 -> println("value is 6")
            7 -> println("value is 7")
            else -> println("other value.")
        }
    }

    fun getValueRanges() {
        when(value) {
            in ranges -> println("value is in the range")
            !in ranges -> println("value is outside the range")
        }
    }

    fun getAnyType() {
        when(anyType) {
            is Long -> println("the value has a Long type")
            !is Long -> println("the value isn't a Long type")
            is Double -> println("the value has a Double type")
            else -> println("another type.")
        }
    }

    fun getRegisterNumber() = Random.nextInt(100)
}

fun main() {
    println(WhenExpression().getValue())
    println(WhenExpression().getValueRanges())
    println(WhenExpression().getAnyType())

    val registerNumber = when(val regist = WhenExpression().getRegisterNumber()) {
        in 1..50 -> 50 * regist
        in 51..100 -> 100 * regist
        else -> regist
    }
    println(registerNumber)
}