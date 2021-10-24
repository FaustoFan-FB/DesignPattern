package com.fausto.pizzastore.simple_factory.improve.order

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

/**
 * @author: fausto
 * @date: 2021/10/22 14:25
 * @description:
 */
class OrderPizza(_factory: SimpleFactory) {

    private var simpleFactory: SimpleFactory? = null

    init {
        setFactory(_factory)
    }

    private fun setFactory(factory: SimpleFactory){
        simpleFactory = factory

        do {
            val flag = simpleFactory?.createPizza(getType())?.run {
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