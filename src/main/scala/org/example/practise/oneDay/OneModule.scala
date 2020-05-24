package org.example.practise.oneDay

object OneModule {
  //做 绝对值
  def abs(n:Int):Int = {
    if(n < 0) -n
    else n
  }

  private def formatAbs(n:Int) : String = {
    val msg = "the absolute value %d is %d"
    msg.format(n,abs(n))
  }

  def main(args :Array[String]) = {
    println(formatAbs(-42))
  }
}
