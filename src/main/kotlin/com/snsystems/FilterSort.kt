package com.snsystems

fun main() {
    val ints = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    for(i: Int in ints) println("ints : $i")

    val smallInts = ints.filter { it < 5 }
    for(i: Int in smallInts) println("smallInts : $i")

    val tripleInts = smallInts.map { it * it * it}
    for(i: Int in tripleInts) println("tripleInts : $i")

    val filterTripleInts = ints.filter { it < 5 }.map { it * it * it }
    for(i: Int in filterTripleInts) println("filterTripleInts : $i")

    val subjects = listOf(
            Subject(1, "Maths"),
            Subject(2, "Science"),
            Subject(3, "English"))

    println("Subjects $subjects")
    val filteredSubjects = subjects.filter { it.subject.startsWith("Eng") }.map { it.subject }
    println("filteredSubjects $filteredSubjects")
}

data class Subject(val id: Int, val subject: String) { }