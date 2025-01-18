package com.belajar.kotlin.oop

class Object {
    val exampleString = "500"
    val exampleInt = exampleString.toInt()
    val anotherString = "10.90"
    val exampleDouble = anotherString.toDouble()

    fun getExample() {
        println(exampleInt is Int)
        println(exampleDouble is Double)
    }

    var countryName: String = "Indonesia"
    var countryRegion: Int = 39
    var isCountry: Boolean = true

    fun countryIdentity() {
        println("Aku berasal dari negara $countryName")
    }

    fun region() {
        println("Jumlah provinsi di $countryName sejumlah $countryRegion provinsi.")
    }

}

fun main() {
    Object().getExample()
    Object().countryIdentity()
    Object().region()

//    Change object from class
    val country = Object()
    println("Name: ${country.countryName}, Region: ${country.region()}, Country: ${country.isCountry}")

    country.countryName = "Australia"
    country.countryRegion = 16
    println("Name: ${country.countryName}, Region: ${country.countryRegion}, Country: ${country.isCountry}")
    println(country.countryName)
}