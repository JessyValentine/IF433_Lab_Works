package oop_00000108930_JessyValentine.week03

class Player(val username: String) {
    private var xp: Int = 0
    var level: Int = 0
        get() = (xp / 100) + 1

    fun addXp(amount: Int){
        var currentLvl = level
        if(amount < 0) {
            println("ERROR: amount can't be negative.")
        } else{
            xp += amount
            if(currentLvl != level){
                println("Level Up! Selamat $username naik ke level $level")
            }
        }
    }
}