package com.fausto.pizzastore.abstract_factory

import com.fausto.pizzastore.abstract_factory.order.Factory
import com.fausto.pizzastore.abstract_factory.order.Order

/**
 * @author: fausto
 * @date: 2021/10/24 18:50
 * @description:
 */
fun main() {
    Order(Factory("BeiJing"))
    Order(Factory("London"))
}