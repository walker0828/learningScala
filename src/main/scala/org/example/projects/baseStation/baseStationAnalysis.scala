package org.example.projects.baseStation

import org.apache.spark.{SparkConf, SparkContext}

object baseStationAnalysis {
  def main(args: Array[String]) = {
    val conf = new SparkConf().setAppName("baseStationAnalysis").setMaster("local")
    val sc = new SparkContext(conf)

    sc.textFile("")

  }
}
