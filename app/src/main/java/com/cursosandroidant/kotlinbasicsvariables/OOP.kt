package com.cursosandroidant.kotlinbasicsvariables

fun main() {
    newTopic("OOP")
    subTopic("class")

    //hacemos una nueva instancia - le damos vida a la clase
    println(School())
    //Tenomos un objeto de tipo School with reference: School@15975490

    //constructor: es aquel que nos permite hacer una nueva instancia y
    // le da valor a las propiedades de nuestra clase
    subTopic("constructor")
    //Solo pasamos dos valores porque los otros dos parametros ya estan inicializados.
    val school = School("Harv", "Main Street #14")
    println(school)

    //override : nos ayuda a sobreescribir unos métodos e invalidamos los que estaban por default
    subTopic("override")

    val schoolInactive = School("Harv", "Main Street #14", School.INACTIVE)
    println(schoolInactive)

    //this
    subTopic("This")
    val highSchool =
        School("Stan", "Independence no.232", mutableListOf(Person("José", "Rodríguez")))
    println(highSchool)

    //properties and methods
    subTopic("methods & properties")
    val person = Person("Nicky", "Lugo")
    println(person.getFullName())
    println(person.showWork())
    println(person.salary)
    person.salary = 10000f
    println(person.salary)

    //set & get
    subTopic("Set & Get")
    person.tax = 20f
    println(person.salary)

    //herencia
    subTopic("Herencia")

    //creamos una nueva instancia de la clase teacher que acabamos de crear
    val teacher = Teacher("Alex", "Castillo", 45)
    highSchool.staff.add(teacher)
    println(highSchool)

    val admin = Admin("Erick", "Torres", 1)
    highSchool.staff.add(admin)
    println(highSchool)

    //super
    subTopic("super")
    println("Teacher: ${teacher.showWork()}")
    println("Admin: ${admin.showWork()}")

    //visibilidad o encapsulamiento
    subTopic("Encapsulamiento")
    println(teacher.firstName)

    // println(teacher.lastName)
    //si queremos que el apellido del teacher ya no sea visible
    //solo podemos acceder al apellido a través del metodo getFullName

    //Companion object
    subTopic("Companion object")
    println(School.ACTIVE)

    val schoolACTIVE = School("Oxf", "Roma no.421", School.ACTIVE)
    println(schoolACTIVE)

    //enum
    subTopic("enum class")
    schoolACTIVE.setType(TypeOfSchool.PRIVATE)
    println(schoolACTIVE.getType())
}