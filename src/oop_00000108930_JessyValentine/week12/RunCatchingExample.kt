package oop_00000108930_JessyValentine.week12

fun main(){
    println("=== TEST RUNCATCHING ===")
    val result: Result<Int> = runCatching{
        "42X".toInt()
    }
}