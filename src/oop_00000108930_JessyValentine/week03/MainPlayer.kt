package oop_00000108930_JessyValentine.week03

fun main(){
    val person = Player("Wibu")

    // Ceritanya nyoba akses player.xp dan error karna dia private
    //person.xp = 1
    //println(${person.xp})

    person.addXp(50)
    person.addXp(60)
}