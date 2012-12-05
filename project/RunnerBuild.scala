import sbt._
import sbt.Keys._

object RunnerBuild extends Build {

  lazy val foo = Project(
    id = "foo",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "foo",
      organization := "org.example",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.10.0-RC3",
      resolvers ++= Seq(
        "Sonatype OSS Snapthots" at "https://oss.sonatype.org/content/repositories/snapshots/"
      ),
      libraryDependencies ++= Seq(
        "com.typesafe.akka" %% "akka-actor" % "2.1.0-RC3" cross CrossVersion.full,
        "com.typesafe.akka" %% "akka-zeromq" % "2.1.0-RC3" cross CrossVersion.full,
        "org.apache.thrift" % "libthrift" % "0.9.0",
        "org.slf4j" % "slf4j-log4j12" % "1.5.8",
        "com.github.tmingos" % "casbah_2.10" % "2.5.0-SNAPSHOT",
        "commons-codec" % "commons-codec" % "1.7"
      ),
      javaSource in Compile <<= (sourceDirectory in Compile)(_ / "thrift/gen-java")
    )
  )
}