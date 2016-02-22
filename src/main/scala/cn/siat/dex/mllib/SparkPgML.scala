package cn.siat.dex.mllib

/**
 * Created by MinCheng on 2015/10/23.
 */

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.mllib.clustering.KMeans
import org.apache.spark.mllib.linalg.{Vectors}
import org.apache.spark.mllib.regression.LabeledPoint
import org.apache.spark.mllib.tree.DecisionTree
import org.apache.spark.mllib.classification.{LogisticRegressionWithLBFGS}
import org.apache.spark.mllib.tree.model.DecisionTreeModel
import org.apache.spark.rdd.RDD

/**
 * This SparkPgML contains the Machine Learning methods to support postgresql method invoke.
 * At this point, we need pass at least the <Input file path>, <ML name>, <Specific method>.
 * The detail usage as follows:
 * (1)Regression DecisionTree: "Usage:<filename,'DT','R',impurity,maxDepth>"
 * (2)Classification DecisionTree: "Usage:<filename,'DT','C',numClasses,impurity,maxDepth>"
 *
 */

object SparkPgML {
  private[mllib] val SPARK_MASTER = "spark://192.168.1.2:7077"
  def main(args: Array[String]): Unit = {
    val resModel = args match {
      case Array(filename, modelName, algo, x, y, z) if modelName == "DT" &&
        algo == "C" => {args.foreach(println)
        runDecisionTreeC(filename, x, y, z)}
      case Array(filename, modelName, algo, x, y) if modelName == "DT" &&
        algo == "R" => {args.foreach(println)
        runDecisionTreeR(filename, x, y)
      }
      case _ => printUsage()
    }

  }

  def runDecisionTreeC(filename:String, args: String *):DecisionTreeModel = {
    println("DTC is running")
    val sc = initialize("DecisionTreeC", SPARK_MASTER)
//    val sc = initialize("DecisionTreeC", "local[3]")
    val parsedData = getDataset(sc, filename)
    val (numClasses, impurity, maxDepth, maxBins) = (args(0).toInt, args(1), args(2).toInt, 32)
    val (model, trainErr) = decisionTreeC(parsedData, numClasses, impurity, maxDepth, maxBins)
//    println(model.toDebugString)
//    model.save(sc, "/Users/SevenYoung/Downloads/dicisiontree.model")
    println("I am done")
    model
  }

  def runDecisionTreeR(filename:String, args:String *):DecisionTreeModel = {
    val sc = initialize("DecisionTreeR", SPARK_MASTER)
    val parsedData = getDataset(sc, filename)
    val categoricalFeaturesInfo = Map[Int, Int]()
    val (impurity, maxDepth, maxBins) = (args(0), args(1).toInt, 32)//args(0) should be 'variance'
    val (model, trainErr) = decisionTreeR(parsedData, categoricalFeaturesInfo, impurity, maxDepth, maxBins)
    println(model.toDebugString)
    model.save(sc, "/Users/SevenYoung/Downloads/dicisiontree.model")
    model
  }

  def initialize(appName:String, master:String):SparkContext = {
    val conf = new SparkConf().setAppName(appName).setMaster(master)
    val sc = new SparkContext(conf)
    sc
  }

  def getDataset(sc:SparkContext, filename:String) = {
    val parsedData = sc.textFile(filename).map { line =>
      val parts = line.split(' ').map(_.toDouble)
      LabeledPoint(parts(0), Vectors.dense(parts.tail))
    }
    parsedData
  }

  def decisionTreeC(trainningData: RDD[LabeledPoint], numClasses: Int, impurity: String, maxDepth: Int, maxBins: Int) = {
    //Classfication
    val categoricalFeaturesInfo = Map[Int, Int]()
    val model = DecisionTree.trainClassifier(trainningData, numClasses, categoricalFeaturesInfo, impurity, maxDepth, maxBins)
    val labelAndPreds = trainningData.map { point =>
      val prediction = model.predict(point.features)
      (point.label, prediction)
    }
    val trainErr = labelAndPreds.filter(r => r._1 != r._2).count().toDouble / trainningData.count()
//    println("learnd Tree Model:" + model.toDebugString)
    (model, trainErr)
  }

  def decisionTreeR(trainningData: RDD[LabeledPoint], categoricalFeaturesInfo: Map[Int, Int], impurity: String, maxDepth: Int, maxBins: Int) = {
    //Regression
    val categoricalFeaturesInfo = Map[Int, Int]()
    val model = DecisionTree.trainRegressor(trainningData, categoricalFeaturesInfo, impurity, maxDepth, maxBins)
    val labelAndPreds = trainningData.map { point =>
      val prediction = model.predict(point.features)
      (point.label, prediction)
    }
    val testMSE = labelAndPreds.map { case (v, p) => math.pow((v - p), 2) }.mean()
    (model, testMSE)
  }

  def LogisticalRegression(args: Array[String]): Unit = {
    if (args.length < 1) {
      System.err.println("Usage: <file>")
      System.exit(1)
    }
    val conf = new SparkConf().setAppName("DecisionTree").setMaster("local[2]")
    val sc = new SparkContext(conf)
    val data = sc.textFile(args(0))
    val parsedData = data.map { line =>
      val parts = line.split("\\s")
      LabeledPoint(parts(0).toDouble, Vectors.dense(parts.tail.map(x => x.toDouble)))
    }
    val splits = parsedData.randomSplit(Array(0.6, 0.4), seed = 11L)
    val trainingData = splits(0)
    val testData = splits(1)
    val model = new LogisticRegressionWithLBFGS().setNumClasses(2).run(trainingData)
    val labelAndPreds = testData.map { point =>
      val prediction = model.predict(point.features)
      (point.label, prediction)
    }
    val trainErr = labelAndPreds.filter(r => r._1 != r._2).count.toDouble / testData.count
    //return (model,trainErr)
  }

  def KNN(args: Array[String]): Unit = {
    ////args:{filename}
    if (args.length < 1) {
      System.err.println("Usage: <file>")
      System.exit(1)
    }
    val conf = new SparkConf()
    val sc = new SparkContext(conf)
    val data = sc.textFile(args(0))
    val parsedData = data.map(s => Vectors.dense(s.split(' ').map(_.toDouble)))
    val numClusters = 2
    val numIterations = 20
    val clusters = KMeans.train(parsedData, numClusters, numIterations)
    println("Vector 1.0 2.1 3.8 belongs to clustering " + clusters.predict(Vectors.dense("1.0 2.1 3.8".split(' ').map(_.toDouble))))
    // return clusters
  }

  def printUsage() = {
    val startLine = "===============================USAGE============================"
    val decisionTreeR = "Usage:<filename,'DT','R',impurity,mxcDepth>"
    val decisionTreeC = "Usage:<filename,'DT','C',numClasses,impurity,mxcDepth>"

    List(startLine,decisionTreeC,decisionTreeR).foreach(println)
  }

}


