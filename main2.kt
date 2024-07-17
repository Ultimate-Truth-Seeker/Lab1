//package com.example.lab1

fun main () {
    val team1 = Team.MERCEDES
    printTeamDetails(team1)
}
enum class Team {
    MERCEDES,
    RED_BULL_RACING,
    FERRARI,
    MCLAREN,
    ASTON_MARTIN,
    ALPINE,
    ALPHATAURI,
    ALFA_ROMEO,
    HAAS,
    WILLIAMS
}

fun printTeamDetails(team: Team) {
    // code for printing team details
    // Task 1: Print Team Details
    println("Team Details: $team")

    // Task 2: Switch Statement. Contiene detalles en inglés sobre los equipos
    when (team) {
        Team.MERCEDES -> println("Mercedes is a top-tier team with multiple championships.")
        Team.RED_BULL_RACING -> println("Red Bull Racing is known for their aggressive strategies.")
        Team.FERRARI -> println("Ferrari has a rich history in Formula 1.")
        Team.MCLAREN -> println("McLaren is a team with a long history in F1.")
        Team.ASTON_MARTIN -> println("Aston Martin is a rebranded team with a fresh start in F1.")
        Team.ALPINE -> println("Alpine, formerly Renault, is a team with a strong French influence.")
        Team.ALPHATAURI -> println("AlphaTauri is Red Bull's sister team, known for nurturing young talent.")
        Team.ALFA_ROMEO -> println("Alfa Romeo is a team with a rich history, recently returning to F1.")
        Team.HAAS -> println("Haas is the first American-led F1 team since 1986.")
        Team.WILLIAMS -> println("Williams is one of the world's leading Formula 1 teams.")
    }
}
