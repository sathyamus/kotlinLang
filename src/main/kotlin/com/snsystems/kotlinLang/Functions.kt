package com.snsystems.kotlinLang

fun main() {
    val func = FunctionsKotlin()
    func.display("Hello")
    println(func.sum(15))
    println(func.sum(15, 25))
    println(func.sum(b = 25))
    println(func.sum(b = 15, a = 25))
    println(func.double(10))

    val a : Int = 100
    val b : Int = 200

    println(a add b)

}

class FunctionsKotlin {

    fun display(text: String?) {
        println("Displaying $text")
    }

    fun sum(a: Int = 10, b: Int = 20): Int {
        return a + b
    }

    fun double(x: Int): Int = x * 2

    infix fun Int.add(a: Int): Int {
        return this + a
    }

}
