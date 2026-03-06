package oop_00000108930_JessyValentine.week05

class CreditCard (accountName: String, val limit: Double, var usedAmount: Double = 0.0) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if ((usedAmount + amount) < limit) {
            usedAmount += amount
            println("Succesfully paid! Yipee!")
        } else{
            println("Transaction failed! Bro ditolak!!!")
        }
    }
}