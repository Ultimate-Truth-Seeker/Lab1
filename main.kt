//package com.example.lab1

import kotlin.math.log

fun main () {
    val driver1 = Driver("Lewis Hamilton", "Mercedes", "UK", 44)
    val driver2 = Driver("Max Verstappen", "Red Bull Racing", "Netherlands", 33)
    val driver3 = Driver("Charles Leclerc", "Ferrari", "Monaco", 16)

    // Task 1: Printing Data
    // NOTE: Ceci me dijo que usara println en vez de logcat para asegurar que compila
    println("Driver Data " + driver1.toString())
    println("Driver Data " + driver2.toString())
    println("Driver Data " + driver3.toString())

    // Task 2: Equality Check
    println("Equality Check "+ "driver1 == driver2: ${driver1 == driver2}")
    println("Inequality Check "+ "driver1 != driver2: ${driver1 != driver2}")

    // Task 3: Copying Data
    val driver4 = driver1.copy()
    driver4.name = "Valtteri Bottas"
    driver4.number = 77
    println("Original Object" + driver1.toString())
    println("Modified Object" + driver4.toString())

    // Task 4: Destructuring Declarations
    val (name, team, country, number) = driver1
    println("Destructured Data "+ "Name: $name, Team: $team, Country: $country, Number: $number")

    // Task 5: toString() Method
    println("toString Method "+ driver1.toString())
    println("toString Method "+ driver2.toString())
    println("toString Method "+ driver3.toString())



}
