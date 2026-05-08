package oop_00000108930_JessyValentine.week11

fun main(){
    val homeDevices = mutableListOf<SmartDevice>()
    val lampuPintar = SmartDevice("Philips WiZ Living Room", "Lighting").apply{
        isOnline = true
        powerLoad = 12
    }.also{
        homeDevices.add(it)
    }

    val perangkat = SmartDevice("Ezviz Outdoor", "Camera").apply{
        isOnline = true
        powerLoad = 5
    }.also{
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }

    val hasil = run{
        SmartDevice("Daikin Inverter (Kabel 3x2.5", "HVAC", false, 800)
    }.also{
        homeDevices.add(it)
    }

    val hasil2 = run{
        SmartDevice("Picolo's Auto Feeder", "Per Care", true, 10)
    }.also{
        homeDevices.add(it)
    }

    val searchResult = homeDevices.find{
        it.category == "Camera"
    }?.let{
        it.diagnose()
    }

    println(searchResult)

    with(homeDevices){
        for(item in this){
            println("\nDevice name: ${item.name}")
            println("Device category: ${item.category}")
            println("Device status: ${item.isOnline}")
            println("Device power: ${item.powerLoad}")
        }
        println("\nList size: ${this.size}")
    }

    val totalPower = homeDevices.run{
        sumOf{it.powerLoad}
    }
    println("Total daya: $totalPower\n")
}