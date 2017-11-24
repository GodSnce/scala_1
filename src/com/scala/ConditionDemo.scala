package com.scala

/**
  * 条件表达式
  */
object ConditionDemo {

    def main(args: Array[String]): Unit = {
        val x = 1
        //判断x的值，将结果给y
        val y = if (x > 1) 1 else -1
        println(y)


        //支持混合类型表达式
        val z = if (x > 1) 1 else "error"
        println(z)

        //如果确实else相当于if(x > 0)1 esle ()
        val m = if (x > 2) 1
        println(m)

        //在scala中每个表达式都有值，acala中有个unit类，写作()，相当于java中的void
        val n = if (x > 2) 1 else ()
        println(n)

        //if和else if
        val k = if (x < 0) 0
        else if (x >= 1) 1 else -1
        println(k)
    }

}
