package com.fausto.liskovsubstitution.poor

/**
 * @author: fausto
 * @date: 2021/10/12 14:56
 * @description: 错误演示
 */

open class A{
    open fun fun1(num1: Int, num2: Int)= num1 + num2
}
class B: A() {
    override fun fun1(a: Int , b: Int) = a + b //模拟方法重写,未意识到的场景
    fun fun2(a: Int , b: Int) = fun1(a,b) + 9  //添加的方法
}

fun main() {
    //
}