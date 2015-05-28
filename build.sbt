name := "pizza"

version := "1.0"

scalaVersion := "2.11.6"

scalacOptions ++= Seq(
  "-deprecation",
  "-feature",
  "-language:reflectiveCalls",
  "-language:postfixOps",
  "-Xlint",
  "-Xfatal-warnings"
)

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"
)
