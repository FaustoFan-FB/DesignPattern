package com.fausto.dependencyinversion.improve

/**
 * @author: fausto
 * @date: 2021/10/11 16:43
 * @description: 优化
 */

interface Receiver{
    fun getInfo(): String{
        return "receiver: you should override this function..."
    }
}

class Email: Receiver{
    override fun getInfo(): String {
        return "电子邮件信息: hello,world!"
    }
}

class WeiXin: Receiver{
    override fun getInfo(): String {
        return "微信信息: hello,earth!"
    }
}

class ShortMsg: Receiver{
    override fun getInfo(): String {
        return "短信信息: 你好中国!"
    }
}

class Person{
    fun receive(receiver: Receiver){
        println(receiver.getInfo())
    }
}

fun main() {
    Person().receive(WeiXin())
}