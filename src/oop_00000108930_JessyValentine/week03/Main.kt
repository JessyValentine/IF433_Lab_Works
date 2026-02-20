package oop_00000108930_JessyValentine.week03

fun main(){
    val e = Employee("Budi")

    e.salary = 500000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")
}