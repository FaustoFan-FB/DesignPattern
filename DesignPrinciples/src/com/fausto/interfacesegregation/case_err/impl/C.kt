package com.fausto.interfacesegregation.case_err.impl

import com.fausto.interfacesegregation.case_err.InterfaceDemo

/**
 * @author: fausto
 * @date: 2021/10/8 15:07
 * @description:
 */
class C: InterfaceDemo {
    override fun operation1() {
        println("C实现了operation1...")
    }

    override fun operation2() {
        println("C实现了operation2...")
    }

    override fun operation3() {
        println("C实现了operation3...")
    }

    override fun operation4() {
        println("C实现了operation4...")
    }

    override fun operation5() {
        println("C实现了operation5...")
    }
}