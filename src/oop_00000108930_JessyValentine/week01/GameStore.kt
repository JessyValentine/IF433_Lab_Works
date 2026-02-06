package oop_00000108930_JessyValentine.week01

fun main(){
    val gameTitle: String = "Valheim"
    val price: Int = 214999
    val finalPrice: Int = calculateDiscount(price)
    val userNote: String? = null

    printReceipt(title = gameTitle, price = price, finalPrice = finalPrice, note = userNote)
}

fun calculateDiscount(price: Int): Int = if (price > 500000) price - (price * 20 / 100) else price - (price * 10 / 100)

fun printReceipt(title: String, price: Int, finalPrice: Int, note: String?) {
    val userNote = note ?: "Tidak ada catatan."
    println("Judul: $title\nHarga Asli: $price\nHarga Akhir: $finalPrice\nCatatan: $userNote")
}