package com.cursosandroidant.kotlinbasicsvariables

class Admin(firstName: String, lastName: String, var officeNumber: Short) : Person(firstName, lastName) {
    override fun showWork(): String {
        return super.showWork() + "\nAgendando documentos en la oficina ${officeNumber}"
    }
}