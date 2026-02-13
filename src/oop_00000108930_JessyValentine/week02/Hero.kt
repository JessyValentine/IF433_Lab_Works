package oop_00000108930_JessyValentine.week02

import oop_00000108930_JessyValentine.week02.Student
import java.util.Scanner

class Hero (val name: String, var hp: Int, val baseDamage: Int){
    fun attack(targetName: String){
        println("$name menebas $targetName")
    }

    fun takeDamage(damage: Int){
        hp -= damage
        if (hp < 0){
            hp = 0
        }
    }

    fun isAlive() : Boolean{
        if (hp > 0) {
            return true
        } else {
            return false
        }
    }

    constructor(name: String, baseDamage: Int): this(name, 100, baseDamage)
}