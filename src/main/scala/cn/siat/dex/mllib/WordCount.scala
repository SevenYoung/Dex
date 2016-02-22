package cn.siat.postspark.mllib

/**
 * Created by SevenYoung on 15-4-1.
 */
import org.apache.spark.{SparkConf, SparkContext}

object WordCount {
  def main(args:Array[String]) {
    //For test
    if(args.length == 1) println(args(0))

//    val conf = new SparkConf().setMaster(SparkPgML.SPARK_MASTER).setAppName("WordCount")
    val conf = new SparkConf().setAppName("WordCount")
//    val conf = new SparkConf().setMaster("local[3]").setAppName("WordCount")
    val sc = new SparkContext(conf)

//    val rdd = sc.parallelize(List("Hello World", "Hello Spark", "ByeBye Hadoop MR"))
    //pgRdd, read from the table name. Get the token before data transfer.
    val rdd = sc.textFile(args(0))
    rdd.flatMap(p => p.split("\\s+")).map(x => (x, 1)).reduceByKey(_ + _).collect().foreach(println(_))
    sc.stop()
  }
}
