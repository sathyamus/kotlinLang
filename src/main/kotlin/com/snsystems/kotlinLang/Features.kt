package com.snsystems.kotlinLang

import com.snsystems.kotlinLang.DealKotlinDTO

fun main() {
    val greeting = "Hello"
    println("$greeting World")
    println(greeting.plus(" World"))

    var dealKotlinDTO = DealKotlinDTO(1, "PRIME", "Premium Deal", "Active")
    System.out.println("Deal Code :  $dealKotlinDTO")
    System.out.println("Deal Name : $dealKotlinDTO.getDealName()")
    System.out.println("Status: $dealKotlinDTO.getStatus()")
}