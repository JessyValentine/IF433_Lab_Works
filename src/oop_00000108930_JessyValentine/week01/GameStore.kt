package oop_00000108930_JessyValentine.week01

fun main(){
    val gameTitle: String = "Valheim"
    val price: Int = 214999

    val finalPrice: Int = calculateDiscount(price)
}

fun calculateDiscount(price: Int): Int = if (price > 500000) price * 20 / 100 else price * 10 / 100