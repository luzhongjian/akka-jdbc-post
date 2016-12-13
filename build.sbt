name := "akka-jdbc"

version := "1.0"

scalaVersion := "2.10.3"

resolvers ++= Seq(
"spray repo" at "http://nightlies.spray.io"
)

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.3.4",
  "com.typesafe.akka" %% "akka-kernel" % "2.3.4",
  "com.typesafe" % "config" % "1.2.1",
  "org.scalatest" % "scalatest_2.10" % "2.0" % "test",
  "mysql" % "mysql-connector-java" % "5.1.24"
)
