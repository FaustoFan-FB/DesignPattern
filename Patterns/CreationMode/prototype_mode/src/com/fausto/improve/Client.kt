package com.fausto.improve

/**
 * @author: fausto
 * @date: 2021/10/29 15:31
 * @description: 重写clone方法后,可直接调用clone方法实现对象复制
 */
fun main() {
    Sheep("rose" , 4 , "black").apply {
        println(clone()===this)
        println(clone())
    }

}