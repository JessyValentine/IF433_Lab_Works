package oop_00000108930_JessyValentine.week03

class Employee (val name: String) {
    var salary: Int = 0
        set(value) {
            println("Mencoba set gaji ke: $value")
            //Next line ini salah ya. Oke, baik
            this.salary = value
        }
}