package oop_00000108930_JessyValentine.week02

import java.util.Scanner

class Loan (val bookTitle: String, val borrower: String, val loanDuration: Int = 1) {
    fun calculateFine(): Int {
        if (loanDuration > 3){
            return (loanDuration - 3) * 2000
        } else {
            return 0
        }
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- BOOK LOANING ---")

    print("Masukkan Judul: ")
    val title = scanner.nextLine()

    print("Masukan Nama: ")
    val name = scanner.nextLine()

    print("Masukan Durasi Peminjaman: ")
    var durasi = scanner.nextInt()

    if (durasi < 1) {
        durasi = 1
    }

    val loans = Loan(title, name, durasi)

    println("--- DETAIL PEMINJAMAN ---")
    println("Judul buku: $title")
    println("Nama peminjam: $name")
    println("Durasi Peminjaman: $durasi")
    println("Total denda: ${loans.calculateFine()}")
}