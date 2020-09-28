package com.snsystems.kotlinLang

fun main() {
    data class Greeting(var greeting1: String, var greeting2: String, var greeting3: String)

    var greeting = Greeting("Hello", "World", "World")
    println("Before with greeting : $greeting")
    with(greeting) {
        greeting2 = "Kotlin"
    }
    println("After with greeting : $greeting")
}