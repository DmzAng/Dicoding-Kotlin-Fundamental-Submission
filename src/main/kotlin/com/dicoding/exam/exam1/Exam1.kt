package com.dicoding.exam.exam1

// TODO 1
fun isEvenNumber(number: Int): Boolean {
    return when (number % 2 == 0) {
        true -> true
        else -> false
    }
}

// TODO 2
fun moreThanFive(number: Int): Boolean {
    if (number < 5) {
        return false
    } else if (number > 5) {
        return true
    }
    return false
}

// TODO 3
fun result(number: Int): Int {
    val sum = number * (number + 10)
    return sum
}
