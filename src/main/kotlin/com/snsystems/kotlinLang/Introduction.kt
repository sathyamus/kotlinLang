package com.snsystems.kotlinLang

fun main() {
    println(start())
    println(joinToString(prefix = "[", postfix = "]"))
    println(foo("a"))
    println(foo("b", number = 1))
    println(foo("c", toUpperCase = true))
    println(foo(name = "d", number = 2, toUpperCase = true))
    println(containsEven(listOf(2,4,6)))
    println(containsEven(listOf(1,3,5)))
    println(containsEven(listOf(1,2,3)))
    println(getPattern())
    println(getPeople())
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

/*
All these Java overloads can be replaced with one function in Kotlin.

public String foo(String name, int number, boolean toUpperCase) {
    return (toUpperCase ? name.toUpperCase() : name) + number;
}
public String foo(String name, int number) {
    return foo(name, number, false);
}
public String foo(String name, boolean toUpperCase) {
    return foo(name, 42, toUpperCase);
}
public String foo(String name) {
    return foo(name, 42);
}
*/

// Pass a lambda to any function to check if the collection contains an even number. The function any gets a predicate as an argument and returns true if there is at least one element satisfying the predicate.
fun containsEven(collection: Collection<Int>): Boolean = collection.any { it % 2 == 0}

val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

// Using month variable rewrite this pattern in such a way that it matches the date in format 13 JUN 1992 (two digits, a whitespace, a month abbreviation, a whitespace, four digits).
fun getPattern(): String = """\d{2} $month \d{4}"""

// Rewrite the following Java code to Kotlin:
//public class Person {
//    private final String name;
//    private final int age;
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//}

data class Person(val name: String, val age: Int) {

}

fun getPeople(): List<Person> {
    return listOf(Person("Alice", 29), Person("Bob", 31))
}
