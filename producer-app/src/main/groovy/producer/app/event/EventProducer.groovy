package producer.app.event

import io.micronaut.rabbitmq.annotation.Binding
import io.micronaut.rabbitmq.annotation.RabbitClient

import java.util.concurrent.CompletableFuture

@RabbitClient("micronaut.rabbitmq.test.events")
abstract class EventProducer {

    abstract CompletableFuture<Void> send(@Binding String routingKey, Event event)

    def send(Event event) {
        send(event.getClass().name, event)
    }

}
