name := "about_task_key"

version := "1.0-SNAPSHOT"

organization := "com.evolutionnext"

TaskKey[Unit]("Boom") := println("Awesome")

sampleKeyC in ThisBuild := "C: in build.sbt scoped to ThisBuild"

sampleKeyD := "D: in build.sbt"
