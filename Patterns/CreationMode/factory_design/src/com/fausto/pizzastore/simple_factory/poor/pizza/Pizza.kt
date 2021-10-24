package com.fausto.pizzastore.simple_factory.poor.pizza

/**
 * @author: fausto
 * @date: 2021/10/22 14:13
 * @description: 披萨抽象类,模拟简单工厂模式实现
 */
abstract class Pizza {
    //披萨名字
    open var name: String = ""

    //准备原材料
    open fun prepare(){}

    //烘培
    open fun bake(){
        println("$name -> backing")
    }

    //切块
    open fun cut(){
        println("$name --> cutting")
    }

    //包装
    open fun box(){
        println("$name ---> boxing")
    }
}