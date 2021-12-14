mainClass in (Compile, packageBin) := Some("command.ScalaKafkaConsumer")

version := "0.1"

scalaVersion := "2.13.6"

//resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
//  "com.typesafe" % "config" % "1.3.2",
  "org.apache.kafka" % "kafka-clients" % "2.4.0",
  "org.apache.kafka" % "connect-json" % "2.4.0",
  "org.apache.kafka" % "connect-runtime" % "2.4.0"//,
//  "org.apache.kafka" % "kafka-streams" % "2.4.0",
//  "org.apache.kafka" %% "kafka-streams-scala" % "2.4.0",
//  "com.fasterxml.jackson.core" % "jackson-databind" % "2.8.5",
//  "org.apache.kafka" % "connect-runtime" % "2.1.0",
//  "javax.ws.rs" % "javax.ws.rs-api" % "2.1.1" artifacts( Artifact("javax.ws.rs-api", "jar", "jar")) // this is a workaround for https://github.com/jax-rs/api/issues/571
)