package com.test001

/**
 * Created by hanzhiqiang@lenztechretail.com 
 * on 2019/9/3. 
 */
object Test001 {
  def main(args: Array[String]): Unit = {
    println("hello word")
    println("������"+add1(1,2))
    println("������"+add(1,2))
    println("�����д��뷽����"+cal(add1,1,2))
    println("�����д��뺯����"+cal(add,1,2))
    println("�����д��뷽��ת������"+cal(add1 _,1,2))
    println("�����д��뺯����"+cal(sub,30,2))
    println("�����д��뺯����"+cal(dev,3,2))
    println("�����д��뺯����"+cal(mul,3,2))
    //ѭ��
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

    // for ѭ�� ,yield�������飬����һ������
    var retVal = for(a <- numList if a != 3; if a < 8)yield a

    // �������ֵ
    for(a <- retVal){
      println( "Value of a: " + a );
    }
  }
  //����,��ʽ: val ������ = (��������) => {������}
  val add = (a:Int,b:Int) => {a+b}
  val sub = (a:Int,b:Int) => {a-b}
  val mul = (a:Int,b:Int) => {a*b}
  val dev = (a:Int,b:Int) => {a/b}
  //����
  def add1(a:Int,b:Int):Int={
    a+b
  }

  def cal(f:(Int,Int)=>Int,x:Int,y:Int):Int ={
    f(x,y)
  }
}
