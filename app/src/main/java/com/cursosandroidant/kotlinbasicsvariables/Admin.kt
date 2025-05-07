package com.cursosandroidant.kotlinbasicsvariables

class Admin(firstName: String, lastName: String, officeNumber: Short) : Person(firstName, lastName) {
    override fun showWork(): String {
        return "Agendando documentos..."
    }
}