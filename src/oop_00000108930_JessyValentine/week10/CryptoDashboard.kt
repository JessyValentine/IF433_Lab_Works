package oop_00000108930_JessyValentine.week10

//Tested

fun main(){
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("ETH", 3.14))
    coinRepo.add(Coin("BTC", 1.2))
    coinRepo.add(Coin("USDT", 2.1))

    val response = ApiResponse("200 OK", coinRepo.getAll())
    println(response.status)

    response.data.forEach { println("Coin Name: ${it.name} Balance: ${it.balance}") }

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("1", 1.4))
    txRepo.add(Transaction("2", 1.1))
    txRepo.add(Transaction("3", 2.2))
}