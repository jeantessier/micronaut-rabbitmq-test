# Micronaut - RabbitMQ Test

This is a simple test of the `micronaut-rabbitmq` integration.

It has a simple producer that writes to an exchange.  It has a simple consumer
that reads from a queue.  The exchange is bound to the queue inside RabbitMQ.

## To Run

You can start the message producer with the following command:

    $ (cd producer-app && ./gradlew run)

You can start one or more message consumers with the following command:

    $ (cd consumer-app && ./gradlew run)

Just hit Ctrl-C in each shell to stop it when you're done.

## To Trigger a Message

    $ http :8080

or

    $ http :8080 name=="Jean Tessier"

## Exchanges and Queues

The applications create the RabbbitMQ resources they need if they cannot find
them.  The producer only creates an exchange (of type `topic`), since that is
all it needs.  The consumer will create an exchange, a queue, and bind the queue
to the exchange, as needed.

Look at each application's `Topography` class for details.
