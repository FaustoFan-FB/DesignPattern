package com.fausto.pizzastore.factory_method.order

import com.fausto.pizzastore.factory_method.pizza.Pizza
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

/**
 * @author: fausto
 * @date: 2021/10/22 14:25
 * @description:
 */
abstract class OrderPizza(_location: String) {

    private val location = _location

    init {
        do {
            val flag = this.createPizza(getType() , location)?.run {
                prepare()
                bake()
                cut()
                box()
                true
            } ?: run {
                println("订购披萨失败...")
                false
            }
        }while (flag)
    }

    abstract fun createPizza(type: String , location: String): Pizza?


    private fun getType(): String{
        return try{
            BufferedReader(InputStreamReader(System.`in`)).apply {
                println("-----input 'greek' or 'cheese' to supply one of pizza , or input any other character to stop order.-----")
                println("开始选购-$location-披萨--Input pizza type...")
            }.readLine()
        }catch (e: IOException){
            e.printStackTrace()
            ""
        }
    }
}