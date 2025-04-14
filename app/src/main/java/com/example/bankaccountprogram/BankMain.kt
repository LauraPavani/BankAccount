package com.example.bankaccountprogram

fun main(){
    val lauBankAccount = BankAccount("Laura Pavani", 25878.24)

    lauBankAccount.deposit(200.00)
    lauBankAccount.withdraw(1200.0)
    lauBankAccount.deposit(3000.0)
    lauBankAccount.deposit(150.0)
    lauBankAccount.withdraw(4598.78)

    lauBankAccount.displayTransactionHistory()
    println("${lauBankAccount.accountHolder}'s balance is ${lauBankAccount.balance}")
}