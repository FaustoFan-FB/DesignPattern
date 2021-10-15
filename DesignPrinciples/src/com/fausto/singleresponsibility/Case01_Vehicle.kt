package com.fausto.singleresponsibility

/**
 * @author: fausto
 * @date: 2021/10/8 13:49
 * @description: 单一职责案例
 */

fun main() {

    /**
     *  方式一
     */
    Vehicle1().run {
        run("汽车")
        run("飞机")//出错,飞机不应在公路上运行
    }

    /**
     *  方式二
     */
    RoadVehicle().run("汽车")
    AirVehicle().run("飞机")
    WaterVehicle().run("游艇")

    /**
     *  方式三
     */
    Vehicle2().run {
        runRoad("汽车")
        runAir("飞机")
        runWater("游艇")
    }
}



/**
 *      方式一:
 *          违反单一职责,应分解成多个类
 */
class Vehicle1 {
    fun run(vehicle: String) {
        println("$vehicle->在公路上运行...")
    }
}

/**
 *      方式二:
 *          1. 遵守单一职责
 *          2. 但是花销太大,需要同时修改客户端
 *          3. 改进: 直接修改 交通类
 */
class RoadVehicle{
    fun run(vehicle: String){
        println("$vehicle->在公路上运行...")
    }
}
class AirVehicle{
    fun run(vehicle: String){
        println("$vehicle->在天空上运行...")
    }
}
class WaterVehicle{
    fun run(vehicle: String){
        println("$vehicle->在水上运行...")
    }
}

/**
 *      方式三:
 */
class Vehicle2{
    fun runRoad(vehicle: String){
        println("$vehicle->在公路上运行...")
    }
    fun runAir(vehicle: String){
        println("$vehicle->在天空上运行...")
    }
    fun runWater(vehicle: String){
        println("$vehicle->在水面上运行...")
    }
}