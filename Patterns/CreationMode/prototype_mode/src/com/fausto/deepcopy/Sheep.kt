package com.fausto.deepcopy

import java.io.*

data class Sheep(
    var name: String,
    var age: Int,
    var color: String,
    var friend: Sheep?

): Serializable{

    constructor(): this("",0,"",null)

    //方式一
    fun deepCopy(): Sheep{
        //不存在引用数据类型,可直接通过copy方法拷贝
        if (this.friend == null){
            return this.copy()
        }
        //存在引用数据类型 , 先拷贝基本数据类型
        val source = this.copy()
        //处理引用数据类型
        source.friend = source.friend?.deepCopy()
        //拷贝完毕
        return source
    }

    //方式二: 运用对象序列化
    fun deepCopyBySerialized(): Sheep{
        //IO流
        var bao: ByteArrayOutputStream? = null
        var oos: ObjectOutputStream? = null
        var bai: ByteArrayInputStream? = null
        var ois: ObjectInputStream? = null

        //克隆后的对象
        var copyResult: Sheep? = null

        try{
            //序列化
            bao = ByteArrayOutputStream()
            oos = ObjectOutputStream(bao)
            //把当前对象以对象流的方式输出
            oos.writeObject(this)

            //反序列化
            bai = ByteArrayInputStream(bao.toByteArray())
            ois = ObjectInputStream(bai)

            copyResult = ois.readObject() as Sheep

        }catch (e: Exception){
            println(e)
            return Sheep()
        }finally {
            bao?.close()
            oos?.close()
            bai?.close()
            ois?.close()
        }

        return copyResult!!
    }



    override fun toString(): String {
        return "Sheep(name='$name', age=$age, color='$color', friend=$friend)--${hashCode()}"
    }


}

fun main() {
    Sheep("tom",4,"black",null).apply {
        val copy = this.deepCopyBySerialized().apply {
            this.friend = Sheep("jack",1,"red",null)
            println(this)
        }
        this.deepCopyBySerialized().apply {
            this.friend = Sheep("rose",3,"white",copy)
            println(this)
        }
        println(this)
    }

}