package com.fausto.generalization

/**
 * @author: fausto
 * @date: 2021/10/15 17:56
 * @description:
 */
abstract class DaoSupport {
    fun save( entity: Any){}
    fun delete(id: Any){}
}