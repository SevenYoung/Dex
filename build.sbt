name := "postSpark"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies += "org.apache.spark" % "spark-core_2.10" % "1.5.1"

libraryDependencies += "org.apache.thrift" % "libthrift" % "0.9.3"

libraryDependencies += "org.apache.spark" % "spark-mllib_2.10" % "1.5.1"

libraryDependencies += "com.jcraft" % "jsch" % "0.1.53"


assemblyJarName in assembly := "postspark_2.10-1.0.jar"

assemblyMergeStrategy in assembly := {
  case m if m.toLowerCase.endsWith("manifest.mf")          => MergeStrategy.discard
  case m if m.toLowerCase.matches("meta-inf.*\\.sf$")      => MergeStrategy.discard
  case "log4j.properties"                                  => MergeStrategy.discard
  case m if m.toLowerCase.startsWith("meta-inf/services/") => MergeStrategy.filterDistinctLines
  case "reference.conf"                                    => MergeStrategy.concat
  case _                                                   => MergeStrategy.first
}

assemblyOption in assembly ~= { _.copy(cacheOutput = false) }