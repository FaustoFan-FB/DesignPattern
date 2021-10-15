package com.fausto.interfacesegregation.case_improve

import com.fausto.interfacesegregation.case_improve.denpendency.A
import com.fausto.interfacesegregation.case_improve.denpendency.B
import com.fausto.interfacesegregation.case_improve.impl.C
import com.fausto.interfacesegregation.case_improve.impl.D

/**
 * @author: fausto
 * @date: 2021/10/8 15:26
 * @description: 测试
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
