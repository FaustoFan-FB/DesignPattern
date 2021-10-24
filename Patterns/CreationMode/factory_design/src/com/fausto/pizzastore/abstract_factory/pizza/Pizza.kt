package com.fausto.pizzastore.abstract_factory.pizza

/**
 * @author: fausto
 * @date: 2021/10/24 18:22
 * @description:
 */
abstract class Pizza {
    //披萨名字
    abstract var name: String


    //准备原材料
    open fun prepare(){
        println("prepare $name raw materials...")
    }

    //烘培
    open fun bake(){
        println("$name -> backing......")
    }

    //切块
    open fun cut(){
        println("$name --> cutting.........")
    }

    //包装
    open fun box(){
        println("$name ---> boxing...............")
    }
}

class CheesePizza(override var name: String = "CHEESE_PIZZA"): Pizza()
class PepperPizza(override var name: String = "PEPPER_PIZZA"): Pizza()
class GreekPizza (override var name: String = "GREEK_PIZZA" ): Pizza()