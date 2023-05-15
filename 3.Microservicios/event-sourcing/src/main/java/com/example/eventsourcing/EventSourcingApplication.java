package com.example.eventsourcing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"org.axonframework.commandhandling.gateway.CommandGateway"})
public class EventSourcingApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventSourcingApplication.class, args);
	}

}
