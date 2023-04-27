package com.example.mycomposecalculator.ui

import com.example.mycomposecalculator.CalculatorOperation

data class CalculatorState(
    val number1: String = "",
    val number2: String = "",
    val operation: CalculatorOperation? = null
)
