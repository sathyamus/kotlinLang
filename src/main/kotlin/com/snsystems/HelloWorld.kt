
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
    printItemsUsingUntil()
    println(1010)
    println(1010L)
    println(1010.1012)
    println(2020.10123f)
    numberBoxing()
    printLargest(10, 20)
    printLargest(20, 10)
    printLargestLess(10, 20)
    printLargestLess(15, 5)
    println(printLargestNoElse(2, 3))
    Invoice("S").method1()
    Invoice("SN", 21).method1()
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

fun easyNotNull(s: String?) {
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

fun printItemsUsingUntil(x: Int = 15) {
    for (i in 0 until x) {
        println(i)
    }
}

fun numberBoxing() {
    val a: Int = 100
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    
    val b: Int = 100
    val boxedB: Int? = b
    val anotherBoxedB: Int? = b

    println(boxedA === anotherBoxedA)
    println(boxedB === anotherBoxedB)
}

fun printLargest(a: Int, b: Int) {
    val max = if (a>b) {
        println("Choose a :")
        a
    } else {
        println("Choose b :")
        b
    }
    println("Max : $max")
}

fun printLargestLess(a: Int, b: Int) {
    val max = if (a>b) a else b
    println("printLargestLess Max : $max")
}

fun printLargestNoElse(a: Int, b: Int) {
    if (a >b)
    a
}

class Invoice(firstName: String) {
    constructor(lastName: String, age: Int): Invoice(firstName) {
        println("Invoice : sec constructor : $this.firstName")
        println("Invoice : sec constructor : $this.lastName")
        println("Invoice : sec constructor : $this.age")
    }

    fun method1() {
        println("Invoice : method1")
        println("Invoice : method1 : $this.firstName")
    }
}