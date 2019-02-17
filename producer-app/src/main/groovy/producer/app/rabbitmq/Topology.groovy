package producer.app.rabbitmq

import com.rabbitmq.client.Channel
import io.micronaut.configuration.rabbitmq.connect.ChannelPool
import io.micronaut.context.event.BeanCreatedEvent
import io.micronaut.context.event.BeanCreatedEventListener

import javax.inject.Singleton

@Singleton
class Topology implements BeanCreatedEventListener<ChannelPool> {

    @Override
    ChannelPool onCreated(BeanCreatedEvent<ChannelPool> event) {
        ChannelPool pool = event.bean
        Channel channel = null
        try {
            channel = pool.channel
        } catch (IOException e) {
            // The channel couldn't be retrieved
        }

        if (channel != null) {
            try {
                channel.exchangeDeclare("micronaut.rabbitmq.test.events", "topic")
            } catch (any) {
                //no-op
            } finally {
                pool.returnChannel(channel)
            }
        }

        pool
    }

}
