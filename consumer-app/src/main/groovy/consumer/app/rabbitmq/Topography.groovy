package consumer.app.rabbitmq

import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel
import io.micronaut.rabbitmq.connect.ChannelInitializer;

import jakarta.inject.Singleton

@Singleton
class Topography extends ChannelInitializer {

    @Override
    void initialize(Channel channel, String name) throws IOException {
        channel.exchangeDeclare("micronaut.rabbitmq.test.events", BuiltinExchangeType.TOPIC)
        channel.queueDeclare("micronaut.rabbitmq.test.events.consumer", false, false, false, [:])
        channel.queueBind("micronaut.rabbitmq.test.events.consumer", "micronaut.rabbitmq.test.events", "#")
    }

}
