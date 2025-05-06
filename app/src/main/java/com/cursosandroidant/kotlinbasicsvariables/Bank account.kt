package com.cursosandroidant.kotlinbasicsvariables


// create a main function
fun main () {
    //Step 1
    println("Welcome to your banking system")
    println("What type of account would you like to create?")
    println("1. Debit account")
    println("2. Credit account")
    println("3. Checking account")

    //Step 2
    // create two mutable variables, one for the accountType as String
    // and other for the userChoice as Integer
    var accountType = ""
    var userChoice: Int

    //Step 3
    while (accountType == ""){
        println ("Choose an option (1, 2, 3)")
        //To simulate a random pick from 1 to 5 numbers,
        // being 1 to 3 the actual options that users have
        userChoice = (1 .. 5).random()
        println("The selected option is ${userChoice}.")

        accountType = when(userChoice){
            1 -> "debit"
            2 -> "credit"
            3 -> "checking"
            else -> continue
        }


    }

    //Step 4 it created an account
    println("You have created a $accountType account.")

    //Step 5 in the created account accountBalance give its balance
    println("Your account: \n")
    var accountBalance = (0..1000).random()
    println("The current balance is $accountBalance US dollars.")
    println("Your movements are... \n")

    val money = (0..1000).random()
    println("The amount you transferred is $money dollars")

    //var output = 0

    fun withdraw(amount: Int): Int{
        accountBalance -= amount
        println("Withdrawn: $$amount. Updated balance after withdraw: $$accountBalance")
        return amount
    }

    var output: Int = withdraw(money)
    println("")
    println("1st Withdraw\n")
    println("The amount you withdrew is $output US dollars.")

    fun debitWithdraw(amount: Int): Int{
        if(accountBalance == 0){
            println("Can't withdraw, no money on this account!")
            return accountBalance
        } else if (amount > accountBalance){
            println("Not enough money on this account! The checking balance is \$$accountBalance dollars.")
            return 0
        } else {
            return withdraw(amount)
        }
    }

    output = debitWithdraw(money)
    println("2nd debitWithdraw\n")
    println("The amount you withdrew is $output dollars.")

    fun deposit (amount: Int): Int {
        accountBalance += amount
        println("You successfully deposited $amount dollars. The current balance is $accountBalance dollars.")
        return amount
    }

    output = deposit(money)
    println("3rd Deposit\n")
    println("The amount you deposited is $output dollars.")

    fun creditDeposit(amount: Int): Int{
        if (accountBalance == 0){
            println("You don't have to deposit anything in order to pay off")
            println("it has already been paid off.")
            return accountBalance
        } else if ((accountBalance + amount) > 0){
            println("Deposit failed, you tried to pay off an amount greater than the credit balance.")
            println("The checking balance is $accountBalance dollars.")
            return 0
        } else if (accountBalance == -amount){
            accountBalance = 0
            print("You have paid off this account!")
            return deposit(amount)
        } else {
            return deposit(amount)
        }
    }
    output = creditDeposit(money)
    println("4th CreditDeposit\n")
    println("The amount you deposited is $output dollars")
}











