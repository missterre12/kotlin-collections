package com.belajar.kotlin.oop

import kotlin.reflect.KProperty

class Delegation {
    private var value: String = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>) : String {
        println("This function is same with Getter for property ${property.name} in class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String) {
        println("This function is same with Setter for property ${property.name} in class $classRef")
        println("Value of ${property.name} from: $value will change into $newValue")
        value = newValue
    }
}

class Flower {
    var name: String by Delegation()
}

class Nature {
    var name: String by Delegation()
}

class Zodiac {
    var name: String by Delegation()
}

fun main() {
    val flower = Flower()
    flower.name = "Rose"
    println("Flower name: ${flower.name}")

    val nature = Nature()
    nature.name = "Land"
    println("Nature name: ${nature.name}")

    val zodiac = Zodiac()
    zodiac.name = "Aquarius"
    println("Zodiac name: ${zodiac.name}")
}

