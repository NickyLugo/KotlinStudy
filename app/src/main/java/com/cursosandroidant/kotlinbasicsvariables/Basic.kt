package com.cursosandroidant.kotlinbasicsvariables
import androidx.core.math.MathUtils

var username = "Al"
const val SPECIES = "Human"
const val SEPARATOR = "===================="


fun main(){
    println("Hello Nick!")
    print("Kotlin basic")
    println()

    //variable
    newTopic("Variables")
    var age: Int = 30
    println(age)
    age = 21
    println(age)

    val name = "Nicky Lugo"
    println(name)
    //name = Alonso Lugo _ no se puede cambiar, por ser tipo val

    var job: String
    job = "Developer"
    //job = 30 <- ERROR!  not the type expecting the compiler
    println(job)

    val language:String
    language = "Kotlin"
    println(language)

    //global variable
    println(username)
    //constantes
    println(SPECIES)

    //String templates
    newTopic("String templates")
    println("My name is $name")
    println("My username is $username")
    println("I am $SPECIES")

    //tipos de datos
    newTopic("Tipos de datos")
    val char: Char = 'a'
    val char2: Char = 'l'
    print(char)
    print(char2)
    println()

    var string: String = "al"
    println(string)

    val boolean: Boolean = true // true = 1  false = 0 <- 1 bit
    println(boolean)

    //8bit -128 to 127
    val jobs: Byte = 3
    println("$jobs trabajos")

    //16 bit -32768 to 32767
    val workedDays: Short = 200
    println("$workedDays dias trabajados")

    //32 bit -2,147,483,648 to 2,147,483,647
    val workedMinutes: Int = 288000
    println("$workedMinutes minutos trabajados")

    //64 bit -9,223,372,036,854,775,808 to +9,223,372,036,854,775,807
    val workedMilliseconds: Long = 17280000000
    println("$workedMilliseconds milisegundos trabajados")

    //32 bit 1.40129846432481707e-45 to 3.40282346638528860e+38
    val height: Float = 1.75f
    println("Estatura: ${height}m")

    //64 bit 4.94065645841248544e-324 to 3.79289313485231570e+308
    val heightDouble: Double = 1.75333333333333
    println("Estatura real ${heightDouble}m")

    //Functions
    newTopic("Funciones")
    basic()
    arguments(name)
    println(returnData())

    //sobrecarga
    overload(age)
    overload(job)
    overload(job, language)
    overload(language = language)
}

fun overload(job: String = "Intern", language: String){
    println("Mi trabajo es: $job con $language")
}

fun overload (job: String){
    println("Mi trabajo es: $job")
}

fun overload (age: Int){
    println("Mi edad es: $age")
}

fun returnData(): String{
    return "Datos Retornados"
}

fun arguments(name: String): Unit{
    println("Hola $name")
}

fun basic(){
    println("hi")
}

fun newTopic(topic: String){
/*    println()
    print("==================== ")
    print(topic)
    print(" ====================")
    println()*/
    print("\n$SEPARATOR $topic $SEPARATOR\n")
}

fun subTopic(subTopic: String){
    /*    println()
        print("==================== ")
        print(topic)
        print(" ====================")
        println()*/
    print("\n$SEPARATOR $subTopic\n")
}

