package oop_00000108930_JessyValentine.week04

fun main(){
    val manager = Manager("Wibu", 10000000)
    val devs = Developer("Lia", 9999999, "Python")

    println("--- Area Lock In dan bekerja ---")
    manager.work()
    devs.work()
    println("Kerja keras Manager membuahkan imbalan tambahan sebesar ${manager.calculateBonus()}")
    println("Kerja keras DEVSS berubah menjadi duit ekstra sebesar ${devs.calculateBonus()}")
}