package com.bootcamp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.entity.PurchaseRequest;
import com.bootcamp.repository.PurchaseRequestRepository;

import reactor.core.publisher.Mono;

@Service
public class PurchaseRequestServiceImpl  implements PurchaseRequestService{

	
	private final PurchaseEventService purchaseEventService;

	public PurchaseRequestServiceImpl(PurchaseEventService purchaseEventService) {
		super();
		this.purchaseEventService = purchaseEventService;
	}
	
	@Autowired
	private PurchaseRequestRepository purchaseRequestRepository;
	
	@Override	
	public Mono<PurchaseRequest> savePurchaseRequest(PurchaseRequest purchaseRequest) {
		Mono<PurchaseRequest> monoPurchaseRequest =  purchaseRequestRepository.save(purchaseRequest);

		this.purchaseEventService.publish(purchaseRequest);
		return monoPurchaseRequest;
	}

}
