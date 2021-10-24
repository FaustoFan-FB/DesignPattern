package com.fausto.pizzastore.simple_factory.poor.pizza

/**
 * @author: fausto
 * @date: 2021/10/22 14:20
 * @description:
 */
class CheesePizza: Pizza() {
    override fun prepare() {
        println("准备奶酪披萨原材料...")
    }
}