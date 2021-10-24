package com.fausto.pizzastore.simple_factory.poor.pizza


/**
 * @author: fausto
 * @date: 2021/10/22 14:23
 * @description:
 */
class GreekPizza : Pizza() {
    override var name: String
        get() = "GreekPizza"
        set(value) {}


    override fun prepare() {
        println("准备希腊披萨原材料...")
    }
}