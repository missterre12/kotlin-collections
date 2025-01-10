package com.belajar.kotlin.iteration

class BooleanLearn {
    val classOpen = 8
    val classClosed = 20
    val now = 30
    val isClose = now < classOpen || now > classClosed

    fun conjunctionOperator(): String {
        return if (now >= classOpen && now <= classClosed) {
            "true"
        } else {
            "false"
        }
    }

    fun negationOperator(): String {
        return if (!isClose) {
            "Office is open."
        } else {
            "Office is closed."
        }
    }
}
