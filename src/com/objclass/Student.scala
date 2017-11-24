package com.objclass

import java.io.IOException

/**
  * 每个类都有主构造器，主构造器的参数直接放置在类名后面，与类交织在一起
  *
  * @param name
  * @param age
  */
class Student(val name:String,val age:Int) {

    println("执行主构造器")

    try {
        println("读取文件")
        throw new IOException("io exception")
    }catch {
        case e: NullPointerException => println("打印异常Exception : " + e)
        case e: IOException => println("打印异常Exception : " + e)

    }finally {
        println("执行finally部分")
    }

    private var gender = "male"

    //用this关键字定义辅助构造器
    def this(name: String,age: Int,gender:String){
        //每个辅助构造器必须以主构造器或其他的辅助构造器的调用开始
        this(name,age)
        println("执行辅助构造器")
        this.gender = gender
    }
}

/**
  * 构造器参数可以不带val或var，如果不带val或var的参数至少被一个方法使用
  * 那么他将会被提升为字段
  * @param name
  * @param prop
  * @param age
  */
class Queen private(val name:String,prop:Array[String],private var age:Int = 18){
    println(prop.size)

    /*
    prop被下面的方法使用后，prop就变成了不可变的对象私有字段，等同于 private[this] val prop
    如果没有被方法使用该参数将不会保存为字段，仅仅是一个可以被主构造器中的代码访问的普通参数
     */
    def description = name + " is " + age + " old " + prop.toBuffer
}

object Queen{
    def main(args: Array[String]): Unit = {
        //私有的构造器只有在其伴生的对象中使用
        val q = new Queen("hatano",Array("蜡烛","皮鞭"),20)
        println(q.description)
    }
}