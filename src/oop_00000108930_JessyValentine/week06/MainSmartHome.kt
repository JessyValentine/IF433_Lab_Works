package oop_00000108930_JessyValentine.week06

fun main(){
    val lampu = SmartLamp("001", "Ruang Tamu")
    val speaker = SmartSpeaker("002", "Google Nest Dapur")
    val watcher = SmartCCTV("003", "Ezviz Garasi")
    val hub = SmartHomeHub()

    hub.addDevice(lampu)
    hub.addDevice(speaker)
    hub.addDevice(watcher)

    hub.activateSecurityMode()
    hub.turnOffAllSwitches()
}