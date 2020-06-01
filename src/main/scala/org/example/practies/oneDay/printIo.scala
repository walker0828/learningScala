package org.example.practies.oneDay

import scala.io.StdIn
import scala.reflect.internal.util.StringOps

object printIo {
  def countDown(n : Int) = {
    println("begin")
    var i = 0;
    for (i <- (0 to n).reverse) {
      println(i)
    }
  }

  // TODO
  def countDown2(n:Int)={
    while (n != 0){
      println(n)
    }
  }

  def countUnicode(word : String): Int = {
    var sum = 1;
    for (i <- 0 until word.length) {
      sum = sum * word.charAt(i)
    }
    sum
  }

//  def countUnicode2(word : String): Int = {
//  }

  def main(args:Array[String]) = {
//    var name = StdIn.readLine("please input your name:")
//    print("your age :")
//    var age = StdIn.readInt()
//    println(s"your name is ${name}")
//    this.countDown2(10)
    var sum = this.countUnicode("hello")
  }
}
