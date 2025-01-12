package com.belajar.kotlin.controlFlow

enum class EnumExpression {
    PROCESS, SHIPPING, DONE, CANCELLED, RETURNED
}

fun main() {
    var statusProcess = EnumExpression.PROCESS
    println(statusProcess)

    var statusShipping = EnumExpression.SHIPPING
    println(statusShipping)

    var statusDone = EnumExpression.DONE
    println(statusDone)

    var statusCancelled = EnumExpression.CANCELLED
    println(statusCancelled)

    var statusReturned = EnumExpression.RETURNED
    println(statusReturned)
}