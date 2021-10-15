package com.fausto.interfacesegregation.case_improve.denpendency

import com.fausto.interfacesegregation.case_err.InterfaceDemo
import com.fausto.interfacesegregation.case_improve.Interface1
import com.fausto.interfacesegregation.case_improve.Interface2
import com.fausto.interfacesegregation.case_improve.Interface3

/**
 * @author: fausto
 * @date: 2021/10/8 15:18
 * @description:
 */
class A {
    fun depend1(i: Interface1){
        i.operation1()
    }
    fun depend2(i: Interface2){
        i.operation2()
    }
    fun depend3(i: Interface2){
        i.operation3()
    }
}