name := "zekeLabs"

version := "1.0"

fork := true

// only relevant for Java sources --
javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

scalaVersion := "2.11.12"

scalacOptions ++= Seq("-unchecked", "-deprecation")

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.4.0"

libraryDependencies += "org.apache.spark" %% "spark-streaming" % "2.4.0"

libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.0"

libraryDependencies += "org.apache.spark" %% "spark-hive" % "2.4.0"

libraryDependencies += "org.apache.spark" %% "spark-graphx" % "2.4.0"

// needed to make the hiveql examples run at least on Linux
javaOptions in run += "-XX:MaxPermSize=128M"

scalacOptions += "-target:jvm-1.8"

// note: tested directly using sbt with -java-home pointing to a JDK 1.8
