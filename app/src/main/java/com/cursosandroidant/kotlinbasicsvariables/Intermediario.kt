package com.cursosandroidant.kotlinbasicsvariables

import java.time.LocalDate

fun main(){
    newTopic("Sentencias condicionales")
    subTopic("If")

    if(true){
        println("Condición exitosa")
    }
    subTopic("Equality")
    if(1==1){
        println("existe igualdad, 1 es ugual a 1")
    }
    subTopic("Equals")
    val al = "Alain"
    if(al.equals("Alain")){
        println("correcto, son iguales")
    }
    subTopic("Logical Operators")
    if(1 != 2){
        println("1 y 2 son diferentes")
    }
    if(1 == 6 || 1 < 6) //uno es menor o igual a 6
    {
        println("1 es menor a 6, solo se cumple una condición de las dos")
    }
    if(1 !=2 && 1 < 2) //se deben cumplir ambas consignas
    {
        println("Ambas consignas para que se cumpla la condicipón o sea verdadero = true")
    }

    subTopic("nested if")
    if(1==1){
        if(1<2){
            println("if anidado")
        }
    }

    val a = 15
    val b = 5

    if(a>b){
        println("a es mayor a b")
    } else {
        println("a no es mayor a b")
    }

    //else if
    if (a < b){
        println("a es menor a b")
    } else if(a == b){
        println("a es igual a b")
    } else {
        println("a es mayor a b")
    }

    //when
    subTopic("use of When")
    val name = "Cursos Android ANT"
    if (name.equals("Karina")){
        println("Hola Kari")
    } else if (name.equals("Pablo")){
        println("Hello Pablin")
    } else if(name.equals("Alain") || name.equals("Cursos Android ANT")){
        println("Hola Alain")
    } else if(name.equals("Pamela")){
        println("Hola Pame")
    } else {
        println("Hola desconocido")
    }

    when(name){
        "karina" -> println("Hola Karina")
        "Pablo" -> println("Hola Pablin")
        "Alain", "Cursos Android ANT" -> println("Hola Alain")
        "Panela" -> println("Hola Pamela")
        else -> println("Hola desconocido")
    }

    //Estructuras de datos - Collections
    newTopic("Collections")
    subTopic("Vararg")
    multiArguments("Karina", "Pamela", "Pablo", "Juan")

    //Array simple
    val arraySimple = arrayOf('p','a','m','e','l','a')

    println(arraySimple[0])
    println(arraySimple.get(1))

    println(arraySimple[4])

    subTopic("listOf")
    //val readOnlyList = listOf("Alain", "Mary", "Chris", "Laura")
    val readOnlyList: List<String>
    readOnlyList = listOf("Alain", "Mary", "Chris", "Laura")

    println("Read-Only: $readOnlyList")
    println("Name at 1 in readOnlyList = ${readOnlyList.get(1)}")

    //mutableListOf
    subTopic("mutableListOf")
    val mutableListMine = mutableListOf("Alain", "Mary", "Chris", "Laura")
    println("Mutable list: $mutableListMine")

    mutableListMine.add("Juan")
    println("New mutable list: $mutableListMine")

    mutableListMine.removeAt(2)
    println("Newest mutable list: $mutableListMine")

    mutableListMine.remove("Mary")
    println("New new mutable list: $mutableListMine")

    //para actualizar un objeto ya existente en la colección
    mutableListMine.set(1,"Angel")
    println("the last mutable list is: ${mutableListMine}")

    // map o también llamados diccionarios.
    subTopic("map")
    val mutableMapNick = mutableMapOf<String, String>()
    mutableMapNick.put("Al", "Alain")
    mutableMapNick.put("Pam", "Pamela")
    mutableMapNick.put("Chris", "Christian")
    println("Map: $mutableListMine")
    println("Get by key: ${mutableMapNick.get("Al")}")

    //methods of mutable
    mutableMapNick.remove("Pam")
    mutableMapNick.set("Al", "Alejandro")
    println("Get by key remove and set: ${mutableMapNick}")

    //para imprimir solo llaves
    println(mutableMapNick.keys)
    //para imprimir solo valores
    println(mutableMapNick.values)

    //como declarar un arreglo que tenga un espacio reservado.
    subTopic("Array of null")
    val nullArrayDeNick = arrayOfNulls<String>(3)
    nullArrayDeNick[1] = "karina"
    println(nullArrayDeNick[1])
    println(nullArrayDeNick[0])

    //methods collection
    subTopic("methods in collections")
    println(readOnlyList)
    println("Sort: ${readOnlyList.sorted()}")
    println("Reverse: ${readOnlyList.reversed()}")
    println("Index of Laura: ${readOnlyList.indexOf("Laura")}")

    //loops
    newTopic("Loops")
    loops("Karina", "Pamela", "Pablo", "Juan", "Albert")

    data class Person(val name: String, val birthday: LocalDate)
    //mutable list to allow adding/removing people
    val peopleInOffice = mutableListOf(
        Person("Miranda", LocalDate.of(1990,11,10)),
        Person("Nicky", LocalDate.of(1987, 5, 6)),
        Person("Elizabeth", LocalDate.of(1959, 6, 12))
    )
    //example to add someone to my list
    peopleInOffice.add(Person("Emma", LocalDate.of(1995, 7, 29)))

    val today: LocalDate = LocalDate.now()
    //Check for birthdays with when
    val birthdayMessages = peopleInOffice.mapNotNull{
            person -> when {
        //Match month and day (no need to check year)
        person.birthday.month == today.month && person.birthday.dayOfMonth == today.dayOfMonth ->
            "Happy Birthday ${person.name} !!!"
        else -> null
    }
    }
    if(birthdayMessages.isEmpty()){
        println("No birthdays today, sorry!")
    } else {
        birthdayMessages.forEach{println(it)}
    }
}

fun loops(vararg names: String) {
    //for
    subTopic("'for' loop")
    for(i in 1 ..10 step 2){
        println(i)
    }

    //forma para recorrer la lista
    println("")
    println("for with .SIZE method")
    for (i in 0..names.size - 1){
        println("$i = ${names.get(i)}")
    }

    //por cada objeto hace algo
    var counter = 1
    println("")
    println("for with counter")
    for (name in names) {
        println("$counter.- $name")
        counter++
    }

    //foreach
    subTopic("foreach")
    names.forEach {
        println(it)
    }
    println("\notra forma de trabajarlo")
    names.forEach { name ->
        println(name)
    }

    //para los rangos de números
    (3..8).forEach{
        println("1.- $it")
    }

    //while
    subTopic("while")
    var index = 0
    while(index<names.size){
        println("index: $index")
        println("name at index: ${names.get(index)}")
        index++
    }


    val today_first: LocalDate = LocalDate.now()
    val message = when(today_first){
        LocalDate.of(2025,5, 12) -> "Happy birthday Nicky!"
        LocalDate.of(2025,11,10) -> "Happy birthday Brianda!"
        LocalDate.of(2025,8,10) -> "Happy birthday Angy!"
        else -> "No birthdays at home today."
    }
    println(message)
}

fun multiArguments(vararg name: String){
    println("vararg en la posición 0 es: ${name[0]}")
}
