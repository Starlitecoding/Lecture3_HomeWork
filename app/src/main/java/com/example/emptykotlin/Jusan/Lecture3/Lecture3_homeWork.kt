package com.example.emptykotlin.Jusan.Lecture3

fun main() {

    var num1 = 5
    println(num1.powCustom(2))

    num1.powCustomWithLambda(3) { result -> println("Result is $result")}


    false.displayTypeInfo()


    DataType.DoubleType(1.4).displayDataTypeInfo()
    DataType.UnitType().displayDataTypeInfo()
}

//Task_1
fun Int.powCustom(exponent: Int): Int{
    var result = 1
    repeat(exponent){
        result *= this
    }
    return result
}


//Task_2
fun Int.powCustomWithLambda(exponent: Int, opDisplay: (Int) -> Unit) {
    var result = 1
    repeat(exponent) {
        result *= this
    }
    opDisplay(result)
}


//Task_3
fun <T> T.displayTypeInfo(){
    when(this){
        is Int -> println("Это Int")
        is String -> println("Это String")
        else -> println("Тип у $this неизвестен")
    }
}

//Task_4
sealed class DataType(){
    class DoubleType(val value: Double) : DataType()
    class  UnitType : DataType()
}


fun DataType.displayDataTypeInfo() {
    when (this) {
        is DataType.DoubleType -> println("Это DoubleType со значением ${this.value}")
        is DataType.UnitType -> println("Это Unit")
    }
}

