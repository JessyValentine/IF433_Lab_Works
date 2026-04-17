package oop_00000108930_JessyValentine.week08

sealed class Product{
    data class Electronic(val id: String, val name: String, val warrantyMonths: Int): Product()
    data class Clothing(val id: String, val name: String, val size: String): Product()
}