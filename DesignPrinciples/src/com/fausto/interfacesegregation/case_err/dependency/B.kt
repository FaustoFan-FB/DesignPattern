package com.fausto.interfacesegregation.case_err.dependency

import com.fausto.interfacesegregation.case_err.InterfaceDemo

/**
 * @author: fausto
 * @date: 2021/10/8 15:09
 * @description:
 */
class B {
    fun depend1(i: InterfaceDemo){
        i.operation1()
    }
    fun depend4(i: InterfaceDemo){
        i.operation4()
    }
    fun depend5(i: InterfaceDemo){
        i.operation5()
    }
}