package producer.app.event

import io.micronaut.rabbitmq.annotation.Binding
import io.micronaut.rabbitmq.annotation.RabbitClient

@RabbitClient("micronaut.rabbitmq.test.events")
abstract class EventProducer {

    abstract send(@Binding String routingKey, Event event)

    def send(Event event) {
        send(event.getClass().name, event)
    }

}
