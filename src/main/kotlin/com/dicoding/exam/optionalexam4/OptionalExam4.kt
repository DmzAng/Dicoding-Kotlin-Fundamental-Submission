package com.dicoding.exam.optionalexam4

// TODO
fun getMiddleCharacters(string: String): String {
    val lenght = string.length
    return if (lenght % 2 == 1) {
        string[lenght / 2].toString()
    } else {
        string.substring(lenght / 2 - 1, lenght / 2 + 1)
    }
}
