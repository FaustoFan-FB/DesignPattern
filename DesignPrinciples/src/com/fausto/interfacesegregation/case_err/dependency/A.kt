package com.fausto.interfacesegregation.case_err.dependency

import com.fausto.interfacesegregation.case_err.InterfaceDemo

/**
 * @author: fausto
 * @date: 2021/10/8 15:09
 * @description:
 */
class A {
    /**
     *      通过接口依赖C类和D类,但是只会用到部分方法
     */
    fun depend1(i: InterfaceDemo){
        i.operation1()
    }
    fun depend2(i: InterfaceDemo){
        i.operation2()
    }
    fun depend3(i: InterfaceDemo){
        i.operation3()
    }
}