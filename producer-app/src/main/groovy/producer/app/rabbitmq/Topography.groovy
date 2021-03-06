package producer.app.rabbitmq

import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel
import io.micronaut.rabbitmq.connect.ChannelInitializer;

import javax.inject.Singleton

@Singleton
class Topography extends ChannelInitializer {

    @Override
    void initialize(Channel channel) {
        channel.exchangeDeclare("micronaut.rabbitmq.test.events", BuiltinExchangeType.TOPIC)
    }

}
