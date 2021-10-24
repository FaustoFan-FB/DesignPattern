package com.fausto.pizzastore.simple_factory.poor.order


import com.fausto.pizzastore.simple_factory.improve.pizza.CheesePizza
import com.fausto.pizzastore.simple_factory.improve.pizza.GreekPizza
import com.fausto.pizzastore.simple_factory.improve.pizza.Pizza
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

/**
 * @author: fausto
 * @date: 2021/10/22 14:25
 * @description:
 */
class OrderPizza{

    private lateinit var pizza: Pizza

    init {
        loop@ do {
            pizza = when (getType()) {
                "greek"  -> GreekPizza()
                "cheese" -> CheesePizza()
                else     -> {
                    println("停止订单...")
                    break@loop
                }
            }
            pizza.apply {
                prepare()
                bake()
                cut()
                box()
            }
        } while (true)
    }

    private fun getType(): String{
        return try{
            BufferedReader(InputStreamReader(System.`in`)).apply {
                println("-----input 'greek' or 'cheese' to supply one of pizza , or input any other character to stop order.-----")
                println("Input pizza type...")
            }.readLine()
        }catch (e: IOException){
            e.printStackTrace()
            ""
        }
    }
}