package org.example.practise.threeDay

import scala.collection.mutable.ArrayBuffer

object func {
  def main(args : Array[String]) = {
//    (1 to 9).map("*" * _).foreach(println _)
//    println(this.question5(Array(1,2,3,4,5)))
    println(this.question6_1(Array(1,2,3,4,5)).mkString(","))
    println(this.question6_2(ArrayBuffer(1,2,3,4,5)).mkString(","))
  }

//  def transfer() : Array[Int] = {
//    val s = Array(1,2,3,4,5)
//    var result = for(elem <- s.indices) {
//
//    }
//  }

  def question5(array: Array[Double]) : Double = {
      array.sum/array.size
  }

  def question6_1(array: Array[Int]) : Array[Int] = {
    array.reverse;
  }

  def question6_2(array: ArrayBuffer[Int]) : ArrayBuffer[Int] = {
    array.reverse;
  }
}
