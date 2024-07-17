//package com.example.lab1

// Exercise 2: Edificios
fun sunsetViews(buildings: List<Int>, direction: String): List<Int> {
    val buildingsCanSeeSunset = mutableListOf<Int>()
    var highestBuilding = 0

    if (direction == "EAST") {
        for (i in buildings.indices.reversed()) {
            if (buildings[i] > highestBuilding) {
                highestBuilding = buildings[i]
                buildingsCanSeeSunset.add(i)
            }
        }
    } else {
        for (i in buildings.indices) {
            if (buildings[i] > highestBuilding) {
                highestBuilding = buildings[i]
                buildingsCanSeeSunset.add(i)
            }
        }
    }

    return buildingsCanSeeSunset.sorted()
}

// Exercise 3: Caracteres repetidos
fun firstNonRepeatingCharacter(string: String): Int {
    val charCounts = mutableMapOf<Char, Int>()

    for (char in string) {
        charCounts[char] = charCounts.getOrDefault(char, 0) + 1
    }

    for (i in string.indices) {
        if (charCounts[string[i]] == 1) {
            return i
        }
    }

    return -1
}
// Main del ejercicio 2 y 3
fun main () {
    val buildings = listOf(3, 5, 4, 4, 3, 1, 3, 2)
    var direction = "EAST"
    println(sunsetViews(buildings, direction))  // prints: [1, 3, 6, 7]
    direction = "WEST"
    println(sunsetViews(buildings, direction))

    val string = "abcdcaf"
    println("Character at position: " + firstNonRepeatingCharacter(string))  // prints: 1
}


