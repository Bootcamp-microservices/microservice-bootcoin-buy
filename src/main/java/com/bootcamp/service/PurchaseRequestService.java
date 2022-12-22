package com.bootcamp.service;

import com.bootcamp.entity.PurchaseRequest;

import reactor.core.publisher.Mono;

public interface PurchaseRequestService {

	
	public Mono<PurchaseRequest> savePurchaseRequest(PurchaseRequest purchaseRequest);
	
	
	
}
