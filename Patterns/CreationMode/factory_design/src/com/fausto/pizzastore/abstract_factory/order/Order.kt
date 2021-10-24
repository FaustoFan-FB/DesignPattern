package com.fausto.pizzastore.abstract_factory.order

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

/**
 * @author: fausto
 * @date: 2021/10/24 18:39
 * @description:
 */
class Order(_factory: Factory) {

    lateinit var pizzaFactory: AbsFactory
    private val location: String = _factory.location

    init {
        setFactory(_factory)
    }

    private fun setFactory(factory: Factory){
        pizzaFactory = factory

        do {
            val flag = pizzaFactory.createPizza(getType())?.run {
                prepare()
                bake()
                cut()
                box()
                println("pizza is ready , have a good time.")
                true
            } ?: run {
                println("create pizza fail...")
                println("quit order...")
                false
            }
        }while (flag)
    }

    private fun getType(): String{
        return try{
            BufferedReader(InputStreamReader(System.`in`)).apply {
                println("====================================================================")
                println("=++++ input 'greek','cheese','pepper' to choose pizza to order ++++=\n" +
                        "=++++ or input any other character to stop order.              ++++=\n" +
                        "====================================================================")
                println("----- start choose -$location- pizza , please input pizza type -----")
            }.readLine()
        }catch (e: IOException){
            e.printStackTrace()
            ""
        }
    }
}