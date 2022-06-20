package org.example

//import org.example.subpackage.takeWhileInclusive2

fun String.extractLine(): String {
    val text: MutableList<String> = mutableListOf()
    split("a")
        .asSequence()
        .map { it.split("b") }
        .takeWhileInclusive { it.size <= 1 }
        .forEach { text.add(it.last()) }
    return text.joinToString(separator = "").trim()
}