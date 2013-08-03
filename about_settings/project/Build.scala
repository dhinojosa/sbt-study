import sbt._
import Keys._

object SettingsBuild extends Build {

  val sampleKeyA = SettingKey[String]("sample-a", "demo key A")
  val sampleKeyB = SettingKey[String]("sample-b", "demo key B")
  val sampleKeyC = SettingKey[String]("sample-c", "demo key C")
  val sampleKeyD = SettingKey[String]("sample-d", "demo key D")

  override lazy val settings = super.settings ++
    Seq(
      sampleKeyA := "A: in Build.settings in Build.scala", resolvers := Seq(),
      sourceDirectories in (ThisProject, Compile) ~= {srcDirs => srcDirs filter(!_.getAbsolutePath.endsWith("src/main/scala"))},
      name := "About Settings Project"
    )

  lazy val root = Project(id = "about_settings",
    base = file("."),
    settings = Project.defaultSettings)
}