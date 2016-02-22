package cn.siat.dex.dexrdd

import cn.siat.dex.server.Block

import scala.collection.JavaConversions._
import scala.collection.mutable.Buffer
import scala.io.Source

import org.apache.spark._
import org.apache.spark.annotation.DeveloperApi
import org.apache.spark.broadcast.Broadcast
import org.apache.spark.deploy.SparkHadoopUtil
import org.apache.spark.executor.DataReadMethod
import org.apache.spark.rdd.RDD
import org.apache.spark.util.{SerializableConfiguration, ShutdownHookManager, NextIterator, Utils}
import org.apache.spark.scheduler.{HostTaskLocation, HDFSCacheTaskLocation}
import org.apache.spark.storage.StorageLevel


/**
 * Created by SevenYoung on 16-1-16.
 */

private[dex] class DexPartition(rddId: Int, idx: Int, hosts:Buffer[String], path:String) extends Partition {
  override def index: Int = idx

  override def hashCode(): Int = 41 * (41 + rddId) + idx

  def getPath: String = path

  def getHosts: Buffer[String] = hosts
}




class DexRDD (@transient sc:SparkContext, blocks:Array[Block]) extends RDD[String](sc, Nil){
  @DeveloperApi
  override def compute(split: Partition, context: TaskContext): Iterator[String] = {
    val sp = split.asInstanceOf[DexPartition]
    val path = sp.getPath
    val host = sp.getHosts(0)
    val command = "root" + "@" + host + ":" + path + " " + "nonsense"
    new JschIterator(command)
  }

//  override def compute(split: Partition, context: TaskContext): Iterator[String] = {
//    val sp = split.asInstanceOf[DexPartition]
//    val path = sp.getPath
//    val bufferredSource = Source.fromFile(path).getLines()
//    bufferredSource
//  }

  override protected def getPartitions: Array[Partition] = {
    val array = new Array[Partition](blocks.size)
    for(i <- 0 until blocks.size) {
      array(i) =  new DexPartition(id, i, blocks(i).getHosts, blocks(i).getPath)
    }
    array
  }


}
