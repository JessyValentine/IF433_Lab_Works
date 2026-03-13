package oop_00000108930_JessyValentine.week06

class SmartLamp(override val id: String, override val name: String): SmartDevice, Switchable {
    override fun turnOff() {
        println("Lampu $name mati.")
    }

    override fun turnOn(){
        println("Lampu $name menyala.")
    }
}