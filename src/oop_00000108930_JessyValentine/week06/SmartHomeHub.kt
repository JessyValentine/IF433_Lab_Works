package oop_00000108930_JessyValentine.week06

class SmartHomeHub() {
    val devices = mutableListOf<SmartDevice>()
    fun addDevice(device: SmartDevice) {
        devices.add(device)
    }
    fun turnOffAllSwitches(){
        for (device in devices) {
            when (device){
                is Switchable -> {
                    device.turnOff()
                }
            }
        }
    }
}