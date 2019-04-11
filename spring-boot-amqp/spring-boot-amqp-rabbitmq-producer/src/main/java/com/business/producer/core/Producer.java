package com.business.producer.core;

import com.business.producer.model.Item;
import com.business.producer.model.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class Producer
{
    @Autowired
    private RabbitTemplate rabbitTemplate;
    private static final Logger LOGGER = LoggerFactory.getLogger(Producer.class);

    private static final String EXCHANGE = "customer_data_exchange";
    private static final String ROUTING_KEY = "customer.order";


    @Scheduled(fixedRate = 5000)
    public void produce()
    {
        LOGGER.info(" Publishing the Customer Order");

        Order order = this.getOrder();
        rabbitTemplate.convertAndSend(EXCHANGE, ROUTING_KEY, order);
    }


    private Order getOrder()
    {
        List<Item> orderItemList = new ArrayList<>();
        Item item1 = new Item("MacBook", 1);
        orderItemList.add(item1);

        Item item2 = new Item("Apple Mouse", 1);
        orderItemList.add(item2);

        Item item3 = new Item("Apple Charger", 1);
        orderItemList.add(item3);

        return new Order("Jack Daniels", new Date(), "Office Address", orderItemList);
    }
}
