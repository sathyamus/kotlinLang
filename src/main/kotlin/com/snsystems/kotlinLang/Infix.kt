package com.snsystems.kotlinLang

import java.math.BigDecimal

class MathSquare {
    infix fun square(n: BigDecimal) : BigDecimal {
        println("Square of $n is :")
        return n * n
    }
}

fun main() {
    val m = MathSquare()
    val result = m square BigDecimal(2)
    println(result)

    val result2 = m.square(BigDecimal(3))
    println(result2)

}