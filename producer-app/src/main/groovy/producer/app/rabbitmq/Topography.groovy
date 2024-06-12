package producer.app.rabbitmq

import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel
import io.micronaut.rabbitmq.connect.ChannelInitializer;

import jakarta.inject.Singleton

@Singleton
class Topography extends ChannelInitializer {

    static final EXCHANGE_NAME = "micronaut.rabbitmq.test.events"

    @Override
    void initialize(Channel channel, String name) throws IOException {
        channel.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.TOPIC)
    }

}
