
fun main() {
    println("Hello Kotlin")
    println(sum(1, 2))
    println(inlineSum(2, 3))
    sumUnit(3, 2)
    sumNoUnit(3, 2)
    easyNotNull(null)
    easyNotNull("Sathya")
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