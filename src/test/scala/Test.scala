/**
 * Created by SevenYoung on 16-1-16.
 */

import org.apache.spark.{SparkContext,SparkConf}

import scala.collection.JavaConverters._

import cn.siat.dex.server.Block
import cn.siat.dex.dexrdd.DexRDD
object Test {
  def main(args: Array[String]): Unit = {
    val b1 = new Block(List("172.20.36.241").asJava, "/tmp/b1.txt", 0, 0, "null")
    val b2 = new Block(List("172.20.36.241").asJava, "/tmp/b2.txt", 0, 0, "null")
    val b3 = new Block(List("172.20.36.245").asJava, "/tmp/b2.txt", 0, 0, "null")
    val blocks = Array(b1,b2,b3)
    val conf = new SparkConf().setAppName("dex").setMaster("local[3]")
    val sc = new SparkContext(conf)
    val input = new DexRDD(sc, blocks)
    input.foreach(println)
//    println(input.count())
  }
}
