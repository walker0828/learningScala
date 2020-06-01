package org.example.practies.twoDay

object FailingFn {
  def failingFn(i: Int): Int = {
    val y: Int = throw new Exception("fail!")
    try {
      val x = 42+ 5
      x+y
    }catch { case e : Exception => 43}
  }

  def mean(xs: Seq[Double]): Double =
    if(xs.isEmpty) throw new ArithmeticException("mean of array list")
    else xs.sum/xs.length

  def main(args :Array[String]) = {
//    val s = if (x>0) 1 else -1
    this.failingFn(12)
  }
}
