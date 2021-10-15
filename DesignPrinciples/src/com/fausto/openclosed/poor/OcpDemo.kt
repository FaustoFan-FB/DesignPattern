package com.fausto.openclosed.poor

import kotlin.properties.Delegates

/**
 * @author: fausto
 * @date: 2021/10/12 15:24
 * @description: 开闭原则反面教材
 */

fun main() {
    GraphicEditor(). apply {
        drawShape(Circle())
        drawShape(Rectangle())
        drawShape(Triangle())
    }

}

//功能使用者
class GraphicEditor{
    fun drawShape(shape: Shape){
        when (shape.type){
            1 -> drawCircle()
            2 -> drawRectangle()
            3 -> drawTriangle()
        }
    }

    private fun drawCircle() = println("绘制圆形...")
    private fun drawRectangle() = println("绘制矩形...")

    //扩展功能时,修改了使用者代码,不符合开闭原则
    private fun drawTriangle() = println("绘制三角形...")

}

//功能提供者
open class Shape{
    var type by Delegates.notNull<Int>()
}
class Circle() : Shape(){
    init {
        super.type = 1
    }
}
class Rectangle() : Shape(){
    init {
        super.type = 2
    }
}

//扩展功能
class Triangle: Shape(){
    init {
        super.type = 3
    }
}