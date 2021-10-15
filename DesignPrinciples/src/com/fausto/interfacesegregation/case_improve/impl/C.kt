package com.fausto.interfacesegregation.case_improve.impl

import com.fausto.interfacesegregation.case_improve.Interface1
import com.fausto.interfacesegregation.case_improve.Interface2

/**
 * @author: fausto
 * @date: 2021/10/8 15:18
 * @description:
 */
class C : Interface1, Interface2 {
    override fun operation1() {
        println("C实现了operation1...")
    }

    override fun operation2() {
        println("C实现了operation2...")
    }

    override fun operation3() {
        println("C实现了operation3...")
    }
}