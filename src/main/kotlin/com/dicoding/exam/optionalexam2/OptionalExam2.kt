package com.dicoding.exam.optionalexam2

// TODO
fun minAndMax(number: Int): Int {
    val value = number.toString().map { it.toString().toInt() }

    val minValue = value.min()
    val maxValue = value.max()

    return (minValue + maxValue)
}
