package com.objclass

/**
  * 在scala中，类不用声明为public
  * scala源文件中可以包含多个类，所有这些类都具有共有可见性
  */
class Person {
    //用val修饰的变量是只读属性，有getter但没有setter
    //相当于java中final修饰
    val id = "9527"

    //用var修饰的变量有getter和setter
    var age: Int = 18

    //类私有字段，只能在类的内部使用
    private var name: String = "陈冠希"

    //对象私有字段，访问权限更加严格，Person类的方法只能访问到当前对象的字段
    private[this] val pet = "狼"
}
