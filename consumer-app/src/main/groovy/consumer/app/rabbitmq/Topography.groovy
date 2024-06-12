package consumer.app.rabbitmq

import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel
import io.micronaut.rabbitmq.connect.ChannelInitializer;

import jakarta.inject.Singleton

@Singleton
class Topography extends ChannelInitializer {

    static final EXCHANGE_NAME = "micronaut.rabbitmq.test.events"
    static final QUEUE_NAME = "micronaut.rabbitmq.test.events.consumer"

    @Override
    void initialize(Channel channel, String name) throws IOException {
        channel.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.TOPIC)
        channel.queueDeclare(QUEUE_NAME, false, false, false, [:])
        channel.queueBind(QUEUE_NAME, EXCHANGE_NAME, "#")
    }

}
