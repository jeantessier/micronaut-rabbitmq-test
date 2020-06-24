package consumer.app.consumer

import io.micronaut.rabbitmq.annotation.Queue
import io.micronaut.rabbitmq.annotation.RabbitListener

import java.text.SimpleDateFormat

import consumer.app.event.Event

@RabbitListener
class EventConsumer {

    static final dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")

    @Queue("micronaut.rabbitmq.test.events.consumer")
    def receive(Event event) {
        println "${dateFormat.format(event.date)}: ${event.message}"
    }

}
