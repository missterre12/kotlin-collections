package com.belajar.kotlin.iteration

class IfExpression {
    val openHours = 10
    val now = 6
}

class IfGreaterThan {
    val openStudy = 10
    val nowStudy = 4
    lateinit var studyClass: String
}

class IfElseIf {
    val openDiscord = 8
    val nowDiscord = 8
    lateinit var discord: String
}

class Nullable {
    val string: String? = "Trial" // null

    fun isNull() {
        if (string != null) {
            println(string.length)
        } else {
            println("")
        }
    }
}

class ElvisOperator {
    val text: String? = null

    fun defaultElvisOperator() {
        val textLength = text?.length ?: 6
        println(textLength)
    }

    fun otherElvisOperator() {
        val textLength = if (text != null) text.length else 8
        println(textLength)
    }

    // contoh pemaksaan kpd objek agar mjd non-null, ketika objeknya null maka akan berjumpa NullPointerException
    fun nonNullAssertion() {
        val textLength = text!!.length
        println(textLength)
    }

}

class ObjectAny {
    val obj: Any = "Try"

    fun isAny() {
        if (obj is String) {
            println("String length is ${obj.length}")
        }
    }
}

fun main() {
    val ifExpression = IfExpression()
    if (ifExpression.now > ifExpression.openHours) {
        println("Office already open.")
    } else {
        println("Office closed.")
    }

    val ifGreaterThan = IfGreaterThan()
    if (ifGreaterThan.nowStudy > ifGreaterThan.openStudy) {
        ifGreaterThan.studyClass = "Study class already open."
    } else {
        ifGreaterThan.studyClass = "Study class is closed."
    }

    val ifElseIf = IfElseIf()
    ifElseIf.discord = if (ifElseIf.openDiscord > 10) {
        "Discord already open."
    } else if (ifElseIf.openDiscord == ifElseIf.openDiscord) {
        "Wait a minute, office will be open."
    } else {
        "Office is closed."
    }

//    langsung manggil instances nya
    Nullable().isNull()
    ObjectAny().isAny()
    ElvisOperator().defaultElvisOperator()
    ElvisOperator().otherElvisOperator()
//    ElvisOperator().nonNullAssertion()
}