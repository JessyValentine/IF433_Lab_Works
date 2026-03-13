package oop_00000108930_JessyValentine.week06

class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {
    override fun stopRecord() {
        println("CCTV $name berhenti merekam")
    }

    override fun startRecord() {
        println("CCTV $name merekam")
    }

    override fun turnOn() {
        println("CCTV $name menyala")
        startRecord()
    }

    override fun turnOff() {
        stopRecord()
        println("CCTV $name mati")
    }
}