package com.fausto.poor

/**
 * @author: fausto
 * @date: 2021/10/29 15:24
 * @description: kotlin自带copy方法 , 而java需要继承Cloneable接口,否则复制对象只能通过以下方式
 */
fun main() {
    Sheep("tom",4,"white").apply {
        println(Sheep(this.name,this.age,this.color) === this)
        println(Sheep(this.name,this.age,this.color))
        println(Sheep(this.name,this.age,this.color))
        println(Sheep(this.name,this.age,this.color))
        println(Sheep(this.name,this.age,this.color))
        println(Sheep(this.name,this.age,this.color))
        println(Sheep(this.name,this.age,this.color))
        println(Sheep(this.name,this.age,this.color))
    }

}