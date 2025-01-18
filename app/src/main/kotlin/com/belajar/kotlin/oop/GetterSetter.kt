package com.belajar.kotlin.oop

class Plant {
    var name: String = "Rose"
}

class Planet {
    var name: String = "Pluto"
        get() {
            println("Getter function")
            return field
        }
        set(value) {
            println("Setter function")
            field = value
        }
}

fun main() {
    val flowerPlant = Plant()
    println("Name: ${flowerPlant.name}")
    flowerPlant.name = "Jasmine"
    println("Name: ${flowerPlant.name}")

    println("---")
    val planet = Planet()
    println("Planet name: ${planet.name}")
    planet.name = "Jupiter"
    println("Planet name: ${planet.name}")
}

