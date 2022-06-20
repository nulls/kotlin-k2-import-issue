package org.example.subpackage

fun <T> Sequence<T>.takeWhileInclusive2(pred: (T) -> Boolean): Sequence<T> {
    var shouldContinue = true
    return takeWhile {
        val result = shouldContinue
        shouldContinue = pred(it)
        result
    }
}