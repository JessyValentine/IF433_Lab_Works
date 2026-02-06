package oop_00000108930_JessyValentine.week01

fun main(){
    val gameTitle: String = "Valheim"
    val price: Int = 214999

    val finalPrice: Int = calculateDiscount(price)

    printReceipt(title = gameTitle, price = price, finalPrice = finalPrice)
}

fun calculateDiscount(price: Int): Int = if (price > 500000) price - (price * 20 / 100) else price - (price * 10 / 100)

fun printReceipt(title: String, price: Int, finalPrice: Int) {
    println("Judul: $title, Harga Asli: $price, Harga Akhir: $finalPrice")
}