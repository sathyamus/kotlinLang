package com.snsystems.kotlinLang

var sumAsLambda = {a: Int, b: Int -> a+b}

fun higherOrderFunc(sum: (Int, Int) -> Int) { // accepting the Lambda as parameter
    var result = sum(2, 4) // invokes the lambda expression by passing parameters
    println("The sum of two numbers : $result")
}

fun main() {
    higherOrderFunc(sumAsLambda) // passing lambda parameters
}