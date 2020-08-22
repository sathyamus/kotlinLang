package com.snsystems.kotlinLang

fun main() {
    println(start())
    println(joinToString(prefix = "[", postfix = "]"))
    println(foo("a"))
    println(foo("b", number = 1))
    println(foo("c", toUpperCase = true))
    println(foo(name = "d", number = 2, toUpperCase = true))

}


fun start(): String = "OK"

fun joinToString(
        separator: String = ", ",
        prefix: String = "",
        postfix: String = ""
        /* ... */
): String {
    return separator
}

fun joinOptions(options: Collection<String>) =
        options.joinToString(prefix = "[", postfix = "]")

fun foo(name: String = "Sathya", number: Int = 42, toUpperCase: Boolean = false) =
        (if (toUpperCase) name.toUpperCase() else name) + number

fun useFoo() = listOf(
        foo("a"),
        foo("b", number = 1),
        foo("c", toUpperCase = true),
        foo(name = "d", number = 2, toUpperCase = true)
)

