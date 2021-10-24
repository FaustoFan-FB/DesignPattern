package com.fausto.pizzastore.simple_factory.improve.order

import com.fausto.pizzastore.simple_factory.improve.pizza.CheesePizza
import com.fausto.pizzastore.simple_factory.improve.pizza.GreekPizza
import com.fausto.pizzastore.simple_factory.improve.pizza.PepperPizza
import com.fausto.pizzastore.simple_factory.improve.pizza.Pizza


/**
 * @author: fausto
 * @date: 2021/10/24 15:08
 * @description:
 */
class SimpleFactory {

    fun createPizza(type: String): Pizza?{
        println("使用简单工厂模式...")
        return when (type) {
            "greek"  ->  GreekPizza()
            "cheese" ->  CheesePizza()
            "pepper" ->  PepperPizza()
            else     -> {
                println("不存在此种披萨,开始退出订单...")
                null
            }
        }
    }
}