package com.test001

/**
 * Created by hanzhiqiang@lenztechretail.com 
 * on 2019/9/3. 
 */
object Test001 {
  def main(args: Array[String]): Unit = {
    println("hello word")
    println("函数："+add1(1,2))
    println("方法："+add(1,2))
    println("方法中传入方法："+cal(add1,1,2))
    println("方法中传入函数："+cal(add,1,2))
    println("方法中传入方法转函数："+cal(add1 _,1,2))
    println("方法中传入函数："+cal(sub,30,2))
    println("方法中传入函数："+cal(dev,3,2))
    println("方法中传入函数："+cal(mul,3,2))
    //循环
    for (a <- 1 to 10){
      print(a+",")
    }
    println()
    for (a <- 1 until 10){
      print(a+",")
    }
    println()
    var numList = List(1, 2, 3, 4, 5, 6)
    for (a <- numList if a > 2 && a < 5){
      print(a+",")
    }
    println()

    // for 循环 ,yield过滤数组，返回一个集合
    var retVal = for(a <- numList if a != 3; if a < 8)yield a

    // 输出返回值
    for(a <- retVal){
      println( "Value of a: " + a );
    }
  }
  //函数,格式: val 函数名 = (参数定义) => {函数体}
  val add = (a:Int,b:Int) => {a+b}
  val sub = (a:Int,b:Int) => {a-b}
  val mul = (a:Int,b:Int) => {a*b}
  val dev = (a:Int,b:Int) => {a/b}
  //方法
  def add1(a:Int,b:Int):Int={
    a+b
  }

  def cal(f:(Int,Int)=>Int,x:Int,y:Int):Int ={
    f(x,y)
  }
}
