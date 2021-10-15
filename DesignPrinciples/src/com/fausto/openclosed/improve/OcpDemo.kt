package com.fausto.openclosed.improve

import kotlin.properties.Delegates

/**
 * @author: fausto
 * @date: 2021/10/12 15:24
 * @description: 开闭原则反面教材
 */

fun main() {
    GraphicEditor().apply {
        drawShape(Circle())
        drawShape(Rectangle())
        drawShape(Triangle())
    }
}

//功能使用者
class GraphicEditor{
    //扩展功能时,无需修改代码
    fun drawShape(shape: Shape){
       shape.draw()
    }
}

//功能提供者
abstract class Shape{
    var type by Delegates.notNull<Int>()
    abstract fun draw()
}
class Circle() : Shape(){
    init {
        super.type = 1
    }

    override fun draw() {
        println("绘制圆形...")
    }
}
class Rectangle() : Shape(){
    init {
        super.type = 2
    }
    override fun draw() {
        println("绘制圆形...")
    }
}

//扩展功能
class Triangle: Shape(){
    init {
        super.type = 3
    }
    override fun draw() {
        println("绘制圆形...")
    }
}