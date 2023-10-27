import Dependencies._

ThisBuild / scalaVersion     := "3.3.1"
ThisBuild / version          := "0.1.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "scalabasics",
    version := "0.1.0-SNAPSHOT",
    
    libraryDependencies += scalaTest % Test
  )
