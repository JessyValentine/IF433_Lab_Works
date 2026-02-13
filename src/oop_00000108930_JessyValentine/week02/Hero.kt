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


fun main(){
    val scanner = Scanner(System.`in`)

    print("Hero Name: ")
    val name = scanner.nextLine()

    print("Stat Damage: ")
    val stDamage = scanner.nextInt()

    val hero = Hero(name = name, baseDamage = stDamage)

    var enemyHp = 100

    while(hero.isAlive() && enemyHp > 0){
        println("Menu: 1. Serang, 2. Kabur")
        print("Choose: ")
        val choice = scanner.nextInt()
        if (choice == 1) {
            hero.attack("Enemy")
            enemyHp -= stDamage
            println("Enemy HP: $enemyHp")
            if (enemyHp > 0){
                hero.takeDamage((10..20).random())
            }
            println("Hero HP: ${hero.hp}")
        } else if (choice == 2) {
            println("Kaburrrrr!!!")
            break
        }
    }

    if(hero.hp > 0 && enemyHp <= 0){
        println("ANNOUNCEMENT: Hero Menang!")
    } else if (hero.hp <= 0 && enemyHp > 0){
        println("ANNOUNCEMENT: Hero Kalah!")
    } else {
        println("\nANNOUNCEMENT: Hero Melakukan Tactical Retreat (Bukan pengecut)")
    }
}