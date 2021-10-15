package com.fausto.dependencyinversion.poor

/**
 * @author: fausto
 * @date: 2021/10/11 16:36
 * @description: 一个类依赖另一个类
 */

class Email{
    fun getInfo(): String{
        return "电子邮件信息: hello,world!"
    }
}

/**
 *      分析:
 *          1. 如果 获取对象 改变如: 微信,短信等. 则需新增类.
 *          2. 解决思路: 引入一个抽象接口: Receiver
 */

class Person{
    fun receive(email: Email){
        println(email.getInfo())
    }
}