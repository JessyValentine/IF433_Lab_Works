package oop_00000108930_JessyValentine.week05

class EWallet (accountName: String, var balance: Double): PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("Successfuly paid! Selamat!")
        } else{
            println("Saldo tidak cukup")
        }

    }

    fun topUp(amount: Double){
        balance += amount
        println("Saldo berhasil topup! Current: $balance")
    }
}