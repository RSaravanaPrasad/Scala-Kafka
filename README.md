# Scala-Kafka-example
> Scala - Kafka producer, consumer

> Producer reads a log file and messages line by line to a topic as a text string and exits

> Consumer reads from the topic by polling continuously every 1 second

##
### Prerequisites
- JDK 1.8
- Scala 2.13.6
- Maven 3
- sbt
- Kafka 

##
### Environment
- Java 1.8
- Kafka topic name: microTopic
- Ensure Zookepper and Kafka are running

##
### Project modules info
1. Scala Kafka Producer Application
  - java -jar scalaKafkaProducer-1.0-SNAPSHOT.jar
    or
  - java -jar scala-kafka-producer-uber-1.0-SNAPSHOT.jar
  Reads a log file and sends line by line to kafka topic and exits
  - "sbt run" command also runs the producer application 

2. Scala Kafka Consumer Application
  - java -jar scalaKafkaConsumer-1.0-SNAPSHOT.jar
	or
  - java -jar scala-kafka-consumer-uber-1.0-SNAPSHOT.jar	
	Consumes the messages by polling on kafka topic every one second
  - "sbt run" command also runs the consumer application
##
### Build on Producer
```
mvn clean install
or
mvn clean package

```
##
### Build on Consumer

```
mvn clean install
or
mvn clean package
```

##
### TEST using Terminal

---

### Kafka RUN
#### run zookeeper server
```
Terminal 1: Start ZooKeeper. In your Kafka installation folder
- .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
```
#### run kafka server
```
Terminal 2: Start KafkaServer. Go to your Kafka installation folder
- .\bin\windows\kafka-server-start.bat .\config\server.properties
```

---


### Application run kakfa-consumer

#### consumer 1 kakfa-consumer
```
Terminal 3: Start kafka consumer 
  - java -jar scalaKafkaConsumer-1.0-SNAPSHOT.jar
```

#### consumer 2 kakfa-consumer
```
Terminal 4: Start kafka Producer
  - java -jar scalaKafkaProducer-1.0-SNAPSHOT.jar
  On start of Producer, the consumed text command messages are logged on Consumer console
```


---
