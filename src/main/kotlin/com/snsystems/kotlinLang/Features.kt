package com.snsystems.kotlinLang

import com.snsystems.kotlinLang.DealKotlinDTO

fun main() {
    val greeting = "Hello"
    println("$greeting World")
    println(greeting.plus(" World"))

    var dealKotlinDTO = DealKotlinDTO(1, "PRIME", "Premium Deal", "Active")
    println("Deal Code :  $dealKotlinDTO")
    println("Deal Name : $dealKotlinDTO.getDealName()")
    println("Status: $dealKotlinDTO.getStatus()")

	easyNotNull(null)
    easyNotNull("Sathya")
}

fun easyNotNull(s: String?) {
s?.let {
	println(s)
}