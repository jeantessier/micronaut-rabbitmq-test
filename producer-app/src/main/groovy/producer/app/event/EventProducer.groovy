package producer.app.event

import io.micronaut.configuration.rabbitmq.annotation.Binding
import io.micronaut.configuration.rabbitmq.annotation.RabbitClient
import io.micronaut.context.annotation.Requires

@RabbitClient("micronaut.rabbitmq.test.events")
public interface EventProducer {

    @Binding("product")
    def send(String data)

}
