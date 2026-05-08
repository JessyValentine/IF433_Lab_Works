package oop_00000108930_JessyValentine.week11

fun main(){
    val homeDevices = mutableListOf<SmartDevice>()
    val lampuPintar = SmartDevice("Philips WiZ Living Room", "Lighting").apply{
        isOnline = true
        powerLoad = 12
    }.also{
        homeDevices.add(it)
    }
}