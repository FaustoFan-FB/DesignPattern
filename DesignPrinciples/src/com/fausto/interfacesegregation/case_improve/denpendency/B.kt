package com.fausto.interfacesegregation.case_improve.denpendency

import com.fausto.interfacesegregation.case_improve.Interface1
import com.fausto.interfacesegregation.case_improve.Interface3

/**
 * @author: fausto
 * @date: 2021/10/8 15:19
 * @description:
 */
class B {
    fun depend1(i: Interface1){
        i.operation1()
    }
    fun depend4(i: Interface3){
        i.operation4()
    }
    fun depend5(i: Interface3){
        i.operation5()
    }
}