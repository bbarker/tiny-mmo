import sbt._
import sbt.Keys._

object MMOBuild extends Build {

  val akkaVersion = "2.4.2"
  lazy val mmo = Project(
    id = "mmo",
    base = file("."),
    settings = Defaults.coreDefaultSettings ++ Seq(
      name := "mmo",
      organization := "com.github.mumoshu.mmo",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.11.8",
      resolvers ++= Seq(
        "Sonatype OSS Snapthots" at "https://oss.sonatype.org/content/repositories/snapshots/"
      ),
      libraryDependencies ++= Seq(
        "com.typesafe.akka" %% "akka-actor" % s"$akkaVersion",
        "com.typesafe.akka" %% "akka-agent" % s"$akkaVersion",
        "com.typesafe.akka" %% "akka-slf4j" % s"$akkaVersion",
        "org.scala-lang" % "scala-reflect" % "2.11.8",
        "org.apache.thrift" % "libthrift" % "0.9.0",
        "org.slf4j" % "slf4j-api" % "1.7.5",
        "org.apache.logging.log4j" % "log4j-slf4j-impl" % "2.0-beta9",
        "org.apache.logging.log4j" % "log4j-core" % "2.0-beta9",
        "org.mongodb" % "casbah_2.11" % "3.1.0",
        "commons-codec" % "commons-codec" % "1.7",
        "org.scala-stm" %% "scala-stm" % "0.7",
        "com.typesafe.akka" %% "akka-testkit" % s"$akkaVersion" % "test",
        "org.specs2" % "specs2-core_2.11" % "3.7.2" % "test",
        "org.mockito" % "mockito-all" % "1.9.0" % "test",
        "org.hamcrest" % "hamcrest-all" % "1.3" % "test"
      ),
      javaSource in Compile <<= (sourceDirectory in Compile)(_ / "thrift/gen-java")
    )
  )
}
