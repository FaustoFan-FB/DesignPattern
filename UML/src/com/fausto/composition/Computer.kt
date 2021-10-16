package com.fausto.composition

/**
 * @author: fausto
 * @date: 2021/10/15 18:24
 * @description:
 */
class Computer(
    private var mouse: Mouse = Mouse(),
    private var monitor: Monitor =Monitor()
)