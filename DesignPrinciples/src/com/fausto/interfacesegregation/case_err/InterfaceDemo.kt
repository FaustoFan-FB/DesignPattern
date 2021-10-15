package com.fausto.interfacesegregation.case_err

import com.fausto.interfacesegregation.case_improve.denpendency.A
import com.fausto.interfacesegregation.case_improve.denpendency.B
import com.fausto.interfacesegregation.case_improve.impl.C
import com.fausto.interfacesegregation.case_improve.impl.D

/**
 * @author: fausto
 * @date: 2021/10/8 15:06
 * @description:
 */
interface InterfaceDemo {
    fun operation1()
    fun operation2()
    fun operation3()
    fun operation4()
    fun operation5()
}

/**
 *      测试
 */
fun main() {
    A().run {
        depend1(C())
        depend2(C())
        depend3(C())
    }

    B().run {
        depend1(C())
        depend4(D())
        depend5(D())
    }
}
