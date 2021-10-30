package com.fausto.shallowcopy

/**
 * @author: fausto
 * @date: 2021/10/29 16:16
 * @description:    浅拷贝: 只拷贝引用(指针,内存地址)而不拷贝内容(指针内容)
 */
data class Sheep(
    var name: String,
    var age: Int,
    var color: String,
    var friend: Sheep?
)

fun main() {
    val tom = Sheep("tom" , 2 , "white" , null)
    val jerry = Sheep("jerry" , 1 , "black" , tom)

    println(jerry.copy().apply { friend?.name = "mark" })
    println(jerry.copy())  //修改引用类型,会影响到所有指向该引用的对象

}