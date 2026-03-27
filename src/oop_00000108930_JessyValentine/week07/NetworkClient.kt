package oop_00000108930_JessyValentine.week07

class NetworkClient private constructor(val url: String) {
    fun connect(){
        println("Connecting to $url...")
    }
}