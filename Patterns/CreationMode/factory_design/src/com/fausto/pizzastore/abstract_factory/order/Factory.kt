package com.fausto.pizzastore.abstract_factory.order

import com.fausto.pizzastore.abstract_factory.pizza.CheesePizza
import com.fausto.pizzastore.abstract_factory.pizza.GreekPizza
import com.fausto.pizzastore.abstract_factory.pizza.PepperPizza
import com.fausto.pizzastore.abstract_factory.pizza.Pizza
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

/**
 * @author: fausto
 * @date: 2021/10/24 18:25
 * @description:
 */
interface AbsFactory{
    var location: String
    fun createPizza(type: String): Pizza?
}

class Factory(_location: String): AbsFactory{
    override var location: String = _location

    override fun createPizza(type: String): Pizza? {
        println("---> start create $type pizza in $location , please wait...")
        return when(type){
            "greek"  ->  GreekPizza()
            "cheese" ->  CheesePizza()
            "pepper" ->  PepperPizza()
            else     -> {
                println("error , we have no type of you order .")
                null
            }
        }
    }

}