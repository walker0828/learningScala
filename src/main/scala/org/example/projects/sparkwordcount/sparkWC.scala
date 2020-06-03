package org.example.projects.sparkwordcount

import org.apache.spark.{SparkConf, SparkContext}

object sparkWC {
  def main(args : Array[String]) = {
    if(args.length < 2) {
      System.out.println("Usage: SparkWordCount <input> <output>")
    }
    val conf = new SparkConf().setAppName("sparkWC").setMaster("local")
    val sc = new SparkContext(conf)
    val file = sc.textFile(args(0))
    val count = file.flatMap(_.split(" ")).map(word => (word,1)).reduceByKey(_+_)
    count.saveAsTextFile(args(1))

    sc.stop()
  }
}
