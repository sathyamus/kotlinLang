package com.snsystems.kotlinLang

fun main() {
    data class Greeting(var greeting1: String, var greeting2: String, var greeting3: String)

    var greeting = Greeting("Hello", "World", "World")
    println("Before apply : $greeting")
    var greeting2 = greeting.apply {
        this.greeting2 = "Kotlin"
    }
    println("After apply : $greeting")
    println("After apply : $greeting2")
}