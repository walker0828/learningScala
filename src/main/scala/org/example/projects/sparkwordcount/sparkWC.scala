package org.example.projects.sparkwordcount

import org.apache.spark.{SparkConf, SparkContext}

object sparkWC {
  def main(args : Array[String]) = {
    val conf = new SparkConf().setAppName("sparkWC").setMaster("local")
    val sc = new SparkContext(conf)


  }
}
