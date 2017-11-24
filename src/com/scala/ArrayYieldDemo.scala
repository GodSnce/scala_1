package com.scala

object ArrayYieldDemo {
    def main(args: Array[String]): Unit = {
        //定义一个数组
        val arr = Array(1,2,3,4,5,6,7,8)
        //将偶数取出乘以10 后再生成一个新的数组
        val res = for (i <- arr if i % 2 == 0) yield i * 10
        println(res.toBuffer)


        //更高级的写法是使用过滤器
        //filter是过滤器，接收一个返回值为boolean的函数
        //map相当于将数组中的每一个元素取出来，应用传进去的函数
        val r = arr.filter(_ % 2 == 0).map(_ * 10)
        println(r.toBuffer)
    }
}
