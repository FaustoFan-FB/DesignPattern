package com.fausto.demeter.poor

/**
 * @author: fausto
 * @date: 2021/10/15 14:34
 * @description: 迪米特法则错误示范
 */
fun main() {
    SchoolManager().printAllEmployee(CollegeManager())
}

class Employee(var id: String)

class CollegeEmployee(var id: String)

class CollegeManager{
    fun getAllEmployee(): List<CollegeEmployee>{
        return ArrayList<CollegeEmployee>().apply {
            for (i in 1..10){
                add(CollegeEmployee("学院员工id=$i"))
            }
        }
    }
}

class SchoolManager{
    //Employee和CollegeManager都是直接朋友
    //隐含了一个CollegeEmployee为非直接朋友,不符合迪米特法则

    private fun getAllEmployee(): List<Employee>{
        return ArrayList<Employee>().apply {
            for (i in 1..5){
                add(Employee("本部员工id=$i"))
            }
        }
    }

    fun printAllEmployee(sub: CollegeManager){
        println("----------学院员工-----------")
        sub.getAllEmployee().forEach {
            println(it.id)
        }
        println("----------学校本部员工------------")
        this.getAllEmployee().forEach {
            println(it.id)
        }
    }
}