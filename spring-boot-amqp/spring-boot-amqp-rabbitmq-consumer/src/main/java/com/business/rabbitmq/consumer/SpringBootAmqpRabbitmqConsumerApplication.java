package com.business.rabbitmq.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAmqpRabbitmqConsumerApplication implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootAmqpRabbitmqConsumerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAmqpRabbitmqConsumerApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        LOGGER.info("application is up and running and listening for the RabbitMQ incoming messages");
    }
}
