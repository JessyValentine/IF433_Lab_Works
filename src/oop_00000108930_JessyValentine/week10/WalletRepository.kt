package oop_00000108930_JessyValentine.week10

class WalletRepository<T>{
    private val items = mutableListOf<T>()
    fun add(item: T){
        items.add(item)
    }

    fun getAll():List<T>{
        return items
    }

    fun <T: Any> search(nama: T){
        val result = items.filter{it == nama}
        println("Hasil pencarian: $result")
    }
}