package com.fausto.dependencyinversion.improve

/**
 * @author: fausto
 * @date: 2021/10/11 17:10
 * @description: 依赖传递的三种方式
 */


/**
 *      1. 接口传递
 */
/*
interface IOpenAndClose{
    fun open(tv: TV)
}
interface TV{
    fun play()
}
class OpenAndClose: IOpenAndClose{
    override fun open(tv: TV) {
        tv.play()
    }
}
*/

/**
 *      2. 构造方法传递
 */
/*interface IOpenAndClose{
    fun open()
}
interface TV{
    fun play()
}
class OpenAndClose(private val tv: TV): IOpenAndClose{
    override fun open() {
        tv.play()
    }
}*/

/**
 *      3. setter方法传递
 */
interface IOpenAndClose {
    fun open()
    fun setTv(tv: TV)
}
interface TV{
    fun play()
}
class OpenAndClose: IOpenAndClose{
    private lateinit var tv: TV

    override fun setTv(tv: TV) {
       this.tv = tv
    }

    override fun open() {
       tv.play()
    }
}



fun main() {
    //1. 接口传递
    /*OpenAndClose().open(object: TV{
        override fun play() {
            println("开启电视...")
        }
    })*/

    //2. 构造方法传递
    /*OpenAndClose(object : TV{
        override fun play() {
            println("开启电视...")
        }
    }).open()*/

    //3. setter方法传递
    /*OpenAndClose().also {
        it.setTv(object : TV{
            override fun play() {
                println("开启电视...")
            }

        })
    }.open()*/


}