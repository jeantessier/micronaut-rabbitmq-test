# Micronaut - RabbitMQ Test

This is a simple test of the `micronaut-rabbitmq` integration.

It has a simple producer that writes to an exchange.  It has a simple consumer
that reads from a queue.  The exchange is bound to the queue inside RabbitMQ.

## To Run

You can start the message producer with the following command:

    $ (cd producer-app && ./gradlew run)

Just hit Ctrl-C to stop it when you're done.

## To Trigger a Message

    $ curl http://localhost:8080/hello
