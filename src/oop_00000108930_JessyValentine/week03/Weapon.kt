package oop_00000108930_JessyValentine.week03

class Weapon (val name: String) {
    var damage: Int = 0
        set(value) {
            if(value < 0){
                println("ERROR: damage can't be negative.")
            } else if(value > 1000){
                field = 1000
            } else{
                field = value
            }
        }

    var tier: String = ""
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}