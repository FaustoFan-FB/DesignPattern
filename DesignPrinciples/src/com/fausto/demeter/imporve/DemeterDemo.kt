package com.fausto.demeter.imporve

/**
 * @author: fausto
 * @date: 2021/10/15 14:34
 * @description: 迪米特法则错误示范
 */
//客户端
fun main() {
    SchoolManager().printAllEmployee(CollegeManager())
}

class Employee(var id: String)

class CollegeEmployee(var id: String)

class CollegeManager{
    private fun getAllEmployee(): List<CollegeEmployee>{
        return ArrayList<CollegeEmployee>().apply {
            for (i in 1..10){
                add(CollegeEmployee("学院员工id=$i"))
            }
        }
    }

    fun printEmployee(){
        println("----------学院员工-----------")
        getAllEmployee().forEach {
            println(it.id)
        }
    }
}

class SchoolManager{
    //Employee和CollegeManager都是直接朋友
    private fun getAllEmployee(): List<Employee>{
        return ArrayList<Employee>().apply {
            for (i in 1..5){
                add(Employee("本部员工id=$i"))
            }
        }
    }

    fun printAllEmployee(sub: CollegeManager){
        sub.printEmployee()
        println("----------学校本部员工------------")
        this.getAllEmployee().forEach {
            println(it.id)
        }
    }
}