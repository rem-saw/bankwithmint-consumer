package com.consumer.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	 @KafkaListener(topics = "com.ng.vela.even.card.verified", groupId = "group_id")
	    public void consume(Object message) {
	        System.out.println("Consumed message: " + message);
	    }

	
}
