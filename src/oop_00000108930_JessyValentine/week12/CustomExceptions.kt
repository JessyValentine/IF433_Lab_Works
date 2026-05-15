package oop_00000108930_JessyValentine.week12

class InsufficientFundsException (
    val amount: Double,
    val balance: Double
): Exception("Attempted $amount, balance: $balance")