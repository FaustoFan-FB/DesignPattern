package com.fausto.aggregation

/**
 * @author: fausto
 * @date: 2021/10/15 18:24
 * @description:
 */
class Computer(
    private var mouse: Mouse,
    private var monitor: Monitor
) {
    fun setMouse(_mouse: Mouse){
        mouse = _mouse
    }
    fun setMonitor(_monitor: Monitor){
        monitor = _monitor
    }
}