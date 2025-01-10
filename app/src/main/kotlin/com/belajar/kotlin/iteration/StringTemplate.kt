package com.belajar.kotlin.iteration

class StringTemplate {
    val animal = "hamster"
}

class StringTemplateNumber {
    val name = "Grace"
    val age = 20
}

class StringTemplateExpression {
    val hour = 6
}

fun main() {
    val stringTemplate = StringTemplate()
    val stringTemplateNumber = StringTemplateNumber()
    val stringTemplateExpression = StringTemplateExpression()
    println("My role is ${stringTemplate.animal}")
    println("My name is ${stringTemplateNumber.name} and I'm ${stringTemplateNumber.age} years old.")
    println("Office ${if (stringTemplateExpression.hour > 7) "already close." else "is open."}")
}