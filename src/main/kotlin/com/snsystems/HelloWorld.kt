
val MAX_SIZE = 100

fun main() {
    println("Hello Kotlin")
    println(sum(1, 2))
    println(inlineSum(2, 3))
    sumUnit(3, 2)
    sumNoUnit(3, 2)
    printItemsUsingFor()
    easyNotNull(null)
    easyNotNull("Sathya")
    println(MAX_SIZE)
    printItemsUsingUntil(10)
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun inlineSum(x: Int, y: Int): Int = x + y

fun sumUnit(x: Int, y: Int): Unit {
    println("Sum of $x and $y is: ${x+y}")
}

fun sumNoUnit(x: Int, y: Int) {
    println("Sum of $x and $y is: ${x+y}")
}

fun easyNotNull(s: String) {
    s?.let {
        println(s)
    }
}

fun printItemsUsingFor() {
    val items = listOf("One", "Two", "Three")
    for (item in items) {
        println(item)
    }
}

fun printItemsUsingFor(x: Int) {
    for (i in 0 until x) {
        println(i)
    }
}