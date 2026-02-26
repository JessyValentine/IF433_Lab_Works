package oop_00000108930_JessyValentine.week04

open class Developer(name: String, baseSalary: Int, val programmingLanguange: String): Employee(name, baseSalary) {
    override fun work(){
        println("$name sedang ngoding menggunakan $programmingLanguange")
    }
}