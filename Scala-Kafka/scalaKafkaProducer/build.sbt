mainClass in (Compile, packageBin) := Some("command.ScalaKafkaProducer")

version := "0.1"

scalaVersion := "2.13.6"

libraryDependencies ++= Seq(
  "org.apache.kafka" % "kafka-clients" % "2.4.0",
  "org.apache.kafka" % "connect-json" % "2.4.0",
  "org.apache.kafka" % "connect-runtime" % "2.4.0"
)