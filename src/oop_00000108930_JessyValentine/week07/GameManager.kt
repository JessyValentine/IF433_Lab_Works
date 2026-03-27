package oop_00000108930_JessyValentine.week07

object GameManager {
    var isGameRunning: Boolean = false

    fun startGame() {
        when (isGameRunning) {
            true -> println("Game sudah berjalan! Mencegah instansiasi ganda.")
            false -> {
                isGameRunning = true
                println("Memulai Game Engine...")
            }
        }
    }
}