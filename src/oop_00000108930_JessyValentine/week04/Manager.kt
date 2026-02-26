package oop_00000108930_JessyValentine.week04

open class Manager(name: String, baseSalary: Int): Employee(name, baseSalary){
    override fun work(){
        println("$name sedang memimpin rapat divisi.")
    }

    override fun calculateBonus(): Int {
        return super.calculateBonus() + 500000
    }
}