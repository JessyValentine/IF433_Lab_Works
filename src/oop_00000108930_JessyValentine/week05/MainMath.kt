package oop_00000108930_JessyValentine.week05

fun main(){
    val penghitung = MathHelper()

    println("Luas persegi: ${penghitung.hitungLuas(20)}")
    println("Luas persegi panjang: ${penghitung.hitungLuas(30, 20)}")
    println("Luas lingkaran: ${penghitung.hitungLuas(7.0)}")
}