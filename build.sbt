ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.0"

lazy val root = (project in file("."))
  .settings(
    name := "delta-lake-demo",
    idePackagePrefix := Some("com.qubits")
  )
  .aggregate(producer, consumer)

lazy val producer = project
  .settings(
    name := "producer",
    // Add core module settings
  )

lazy val consumer = project
  .settings(
    name := "consumer",
    // Add api module settings
  )
