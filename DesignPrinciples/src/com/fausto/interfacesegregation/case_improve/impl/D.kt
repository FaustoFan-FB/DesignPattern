package com.fausto.interfacesegregation.case_improve.impl

import com.fausto.interfacesegregation.case_improve.Interface1
import com.fausto.interfacesegregation.case_improve.Interface3

/**
 * @author: fausto
 * @date: 2021/10/8 15:18
 * @description:
 */
class D : Interface1, Interface3 {
    override fun operation1() {
        println("D实现了operation1...")
    }

    override fun operation4() {
        println("D实现了operation4...")
    }

    override fun operation5() {
        println("D实现了operation5...")
    }
}