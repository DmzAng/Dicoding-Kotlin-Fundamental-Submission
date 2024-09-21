package com.dicoding.exam.optionalexam3

// TODO
fun manipulateString(str: String, int: Int): String {
    val numberInStr = str.filter { it.isDigit() }

    return if (numberInStr.isNotEmpty()) {
        val numValue = numberInStr.toInt() * int
        "${str.replace(numberInStr, "")}$numValue"
    } else {
        "$str$int"
    }
}
