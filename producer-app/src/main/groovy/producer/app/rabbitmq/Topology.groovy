package producer.app.rabbitmq

import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel
import io.micronaut.configuration.rabbitmq.connect.ChannelInitializer;

import javax.inject.Singleton

@Singleton
class Topology extends ChannelInitializer {

    @Override
    void initialize(Channel channel) {
        channel.exchangeDeclare("micronaut.rabbitmq.test.events", BuiltinExchangeType.TOPIC)
    }

}
