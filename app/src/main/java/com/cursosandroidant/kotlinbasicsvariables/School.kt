package com.cursosandroidant.kotlinbasicsvariables

class School (var name:String, var address: String, val active: Boolean = true, numCode: String = "") {

    var staff: MutableList<Person>
    init {
        staff = mutableListOf()
    }

    //La ventaja de poner la propiedad dentro del constructor?
    // Que vamos a exigir que se tenga que inicializar con un valor

    //Podemos tener más de un constructor
    constructor():this("","")
    constructor(name:String, address:String, staff:MutableList<Person>): this(name, address){
        //este es el staff de la clase y el segundo es el parametro.
        this.staff = staff
    }
    // this. es una referencia al mismo contexto al que nos encontramos

    override fun toString(): String {
        if(active){
            return if(staff.size>0){
                "name: $name at $address, with ${staff.size} members"
            } else {
                "name: $name at $address"
            }
        } else {
            return "Inactive school"
        }
    }
}