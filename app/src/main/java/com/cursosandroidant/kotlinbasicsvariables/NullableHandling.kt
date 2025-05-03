package com.cursosandroidant.kotlinbasicsvariables

//step 1
data class Student(val fullName: String, var id: Int, var grade:Double)

val students = listOf<Student>(
    Student("John", 223, 140.0),
    Student("Mark", 548, 120.0),
    Student("Natali", 342, 150.0),
    Student("Sara", 781,130.0),
    Student("Nick", 625, 150.0)
)

//step 4
fun main(){
    println("Please, enter the student's ID")
    val id = readln().toInt()
    println(getStudentById(id))
    println("Please, enter the student's name")
    val name = readln()
    println(searchInStudents(name)?:"the student is not found")
}

//step 2
fun getStudentById(id: Int): Student{
    return students.find { it.id == id}!!
}

//step 3
fun searchInStudents(name:String): Student?{
    return students.find{ it.fullName.lowercase()==name.lowercase()}
}