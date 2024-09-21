package com.dicoding.exam.exam2

// TODO 1
fun calculate(valueA: Int, valueB: Int, valueC: Int?): Int {
    val defaultValueC = valueC ?: 50
    val calculate = valueA + (valueB - defaultValueC)
    return calculate
}

// TODO 2
fun result(result: Int): String {
    return "Result is $result"
}
