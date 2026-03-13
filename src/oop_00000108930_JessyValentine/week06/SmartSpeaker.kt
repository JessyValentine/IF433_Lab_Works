package oop_00000108930_JessyValentine.week06

class SmartSpeaker(override val id: String, override val name: String): SmartDevice, Switchable {
    override fun turnOn() {
        println("Speaker $name is on.")
    }

    override fun turnOff() {
        println("Speaker $name is off.")
    }

    fun playMusic(song: String){
        println("Memutar lagu $song dari Spotify")
    }
}