package com.fausto.pizzastore.factory_method.order

import com.fausto.pizzastore.factory_method.pizza.CheesePizza
import com.fausto.pizzastore.factory_method.pizza.GreekPizza
import com.fausto.pizzastore.factory_method.pizza.PepperPizza
import com.fausto.pizzastore.factory_method.pizza.Pizza

/**
 * @author: fausto
 * @date: 2021/10/24 17:03
 * @description:
 */

class LOCOrderPizza(var location: String): OrderPizza(location){

    override fun createPizza(type: String , location: String): Pizza? {
        println("开始订购-->$location 披萨...")
        return when(type){
            "greek"  ->  GreekPizza(location = location)
            "cheese" ->  CheesePizza(location = location)
            "pepper" ->  PepperPizza(location = location)
            else     -> {
                println("不存在此种披萨,开始退出订单...")
                null
            }
        }
    }

}