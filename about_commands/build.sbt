name := "Time Plugin"

version := "0.1-SNAPSHOT"

sbtPlugin := true

organization:= "com.evolutionnext"

scalaVersion := "2.9.2"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "1.9.1" % "test",
  "org.joda" % "joda-convert" % "1.3.1",
  "joda-time" % "joda-time" % "2.1"
)
