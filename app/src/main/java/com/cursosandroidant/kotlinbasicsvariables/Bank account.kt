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
    var userChoice = 0

    //Step 3
    while (accountType == ""){
        println ("Choose an option (1, 2, 3)")
        //To simulate a random pick from 1 to 5 numbers,
        // being 1 to 3 the actual options that users have
        userChoice = (1 .. 5).random()
        println("The selected option is ${userChoice}.")

        when(userChoice){
            1 -> accountType = "debit"
            2 -> accountType = "credit"
            3 -> accountType = "checking"
            else -> continue
        }
    }

//Step 4
println("You have created a ${accountType} account.")

}