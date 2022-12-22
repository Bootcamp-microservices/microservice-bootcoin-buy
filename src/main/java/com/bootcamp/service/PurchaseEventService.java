package com.bootcamp.service;

import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;


import com.bootcamp.entity.PurchaseRequest;

import com.bootcamp.event.Event;
import com.bootcamp.event.EventType;
import com.bootcamp.event.PurchaseCreatedEvent;

@Component
public class PurchaseEventService {

	@Autowired
	private KafkaTemplate<String,Event<?>> producer;
	
	public void publish(PurchaseRequest association) {
		PurchaseCreatedEvent created = new PurchaseCreatedEvent();
		created.setData(association);
		created.setId(UUID.randomUUID().toString());
		created.setType(EventType.CREATED);
		created.setDate(new Date());
		this.producer.send("topic-bootcoin-1",created);
	}
	
}
