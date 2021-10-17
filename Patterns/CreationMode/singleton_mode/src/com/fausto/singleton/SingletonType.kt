package com.fausto.singleton

import java.lang.reflect.Method
import kotlin.concurrent.thread

/**
 * @author: fausto
 * @date: 2021/10/16 14:50
 * @description: 饿汉式与懒汉式单例模式
 */

/**
 *      饿汉式线程安全
 */
object Singleton0

/**
 *      懒汉式线程不安全(违背单例模式,不推荐使用)
 */
class Singleton1 private constructor(){

    companion object{
        private var mInstance: Singleton1? = null
            get(){
                if (field == null) field = Singleton1()
                return field
            }
        fun getInstance(): Singleton1 {
            return mInstance!!
        }
    }
}

/**
 *      懒汉式线程安全 (效率降低,不推荐)
 */
class Singleton2 private constructor(){
    companion object{
        private var mInstance: Singleton2? = null

        @Synchronized
        fun getInstance(): Singleton2 {
            return mInstance ?: Singleton2().apply {
                mInstance = this
            }
        }
    }
}

/**
 *      双重校验锁(推荐)
 */
class Singleton3 private constructor(){
    companion object{
        val instance: Singleton3 by lazy(mode = LazyThreadSafetyMode.PUBLICATION) {
            Singleton3()
        }
    }
}

/**
 *      静态内部类
 */
class Singleton4 private constructor(){
    private object SingletonHolder{
        val holder = Singleton4()
    }
    companion object{
        val instance = SingletonHolder.holder
    }
}

/**
 *      枚举方式
 */
enum class Singleton{
    INSTANCE
}

fun main() {
    //饿汉式
    //println(Singleton0)
    //println(Singleton0)

    println(Singleton.INSTANCE.hashCode())


    //懒汉式
    //println(Singleton1.getInstance())
    //println(Singleton1.getInstance())
    //threadTest(1000 , Singleton2)
}


fun<T> threadTest(num: Int , type: T){

    var getInstance: Method = type!!::class.java.getMethod("getInstance")

    thread {
        run {
            for (i in 0..num){
                println("${Thread.currentThread().name}==>${getInstance.invoke(type)}---$i")
            }
        }
    }
    thread {
        run {
            for (i in 0..num){
                println("${Thread.currentThread().name}==>${getInstance.invoke(type)}---$i")
            }
        }
    }
    thread {
        run {
            for (i in 0..num){
                println("${Thread.currentThread().name}==>${getInstance.invoke(type)}---$i")
            }
        }
    }
}