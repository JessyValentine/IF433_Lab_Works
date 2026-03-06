
package oop_00000108930_JessyValentine.week05

fun main(){
    val dompet = EWallet("Orang baik", 50000.0)
    val kartu = CreditCard("Orang baik", 100000.0)

    val listPaymentMethod: List<PaymentMethod> = listOf(dompet, kartu)

    for (payment in listPaymentMethod) {
        payment.processPayment(75000.0)
    }
}