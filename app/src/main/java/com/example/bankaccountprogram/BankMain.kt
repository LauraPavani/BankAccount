package com.example.bankaccountprogram

fun main(){
    val lauBankAccount = BankAccount("Laura Pavani", 25878.24)
    val sarahBankAccount = BankAccount("Sarah Pigliasi", 0.0)

    lauBankAccount.deposit(200.00)
    lauBankAccount.withdraw(1200.0)
    lauBankAccount.deposit(3000.0)
    lauBankAccount.deposit(150.0)
    lauBankAccount.withdraw(4598.78)
    lauBankAccount.deposit(25989.93)

    lauBankAccount.displayTransactionHistory()
    println("\n")
    println("*** ${lauBankAccount.accountHolder}'s balance is $${lauBankAccount.acctBalance()}\n")
    println("\n")

    sarahBankAccount.deposit(23.50)
    sarahBankAccount.deposit(5234.41)
    sarahBankAccount.deposit(43907.0)
    sarahBankAccount.withdraw(4.43)
    sarahBankAccount.withdraw(8.44)
    sarahBankAccount.withdraw(98.90)
    sarahBankAccount.withdraw(45.25)
    sarahBankAccount.withdraw(78.99)

    sarahBankAccount.displayTransactionHistory()
    println("\n")
    println("*** ${sarahBankAccount.accountHolder}'s balance is $${sarahBankAccount.acctBalance()}\n")
    println("\n")

}