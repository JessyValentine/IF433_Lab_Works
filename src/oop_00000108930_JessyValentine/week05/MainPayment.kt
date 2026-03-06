package oop_00000108930_JessyValentine.week05

fun main(){
    val dompet = EWallet("Orang baik", 50000.0)
    val kartu = CreditCard("Orang baik", 100000.0)

    val listPaymentMethod: List<PaymentMethod> = listOf(dompet, kartu)

    for (payment in listPaymentMethod) {
        when (payment) {
            is EWallet -> {
                payment.topUp(50000.0)
            }
        }
        payment.processPayment(75000.0)
    }
}