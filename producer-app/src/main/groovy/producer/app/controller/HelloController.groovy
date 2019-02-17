package producer.app.controller

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

import javax.inject.*

import producer.app.event.Event
import producer.app.event.EventProducer

@Controller("/hello")
class HelloController {

    @Inject
    EventProducer eventProducer

    @Get(produces = MediaType.TEXT_PLAIN)
    def index() {
        eventProducer.send(new Event(message: "Hello World", date: new Date()))

        return "OK"
    }

}