package com.cursosandroidant.kotlinbasicsvariables

open class Person(val firstName: String, private val lastName: String) {
    var tax: Float = 10.0f
        get() = 1-(field*0.01f)

    var salary: Float = 0f
        set (value){
            field = value
        }
        get() = field*tax
    //Propiedades define las caracteristicas de un objeto
    //Funciones definen las actividades de ese objeto
    fun getFullName(): String = "$firstName, $lastName"

    open fun showWork(): String{
        return "Capturando datos..."
    }


}