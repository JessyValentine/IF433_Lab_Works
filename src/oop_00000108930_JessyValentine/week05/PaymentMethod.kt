package oop_00000108930_JessyValentine.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}