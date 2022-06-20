package org.example

fun String.extractLine(): String {
    var text: MutableList<String> = mutableListOf()
    split("a")
        .asSequence()
        .map { it.split("b") }
        .takeWhileInclusive { it.size <= 1 }
        .forEach { text.add(it.last()) }
    text = text.asReversed()
    split("a")
        .asSequence()
        .map { it.split("b") }
        .takeWhileInclusive { it.size <= 1 }
        .forEach { text.add(it.first()) }
    return text.joinToString(separator = "").trim()
}