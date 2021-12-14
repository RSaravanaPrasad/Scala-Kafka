package command
import java.util.Properties
import org.apache.kafka.clients.producer._
import scala.io.Source

object ScalaKafkaProducer{
    def main(args: Array[String]): Unit = {
        writeToKafka("microTopic")
    }
    def writeToKafka(topic: String): Unit = {
        val props = new Properties()
            props.put("bootstrap.servers", "localhost:9092")
            props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer")
            props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer")
        val producer = new KafkaProducer[String, String](props)

        val filePath = "C:\\logs\\application.log"
        var count = 0
        for(line <- Source.fromFile(filePath).getLines) {
                count += 1
            val record = new ProducerRecord[String, String](topic, count.toString, line)
            producer.send(record)
        }
        producer.close()
    }
}