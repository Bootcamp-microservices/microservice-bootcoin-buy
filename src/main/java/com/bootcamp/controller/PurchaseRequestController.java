package com.bootcamp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.entity.PurchaseRequest;
import com.bootcamp.service.PurchaseRequestService;

import reactor.core.publisher.Mono;

@RestController
public class PurchaseRequestController {
	
	
	@Autowired
	private PurchaseRequestService purchaseRequestService;
	
	@PostMapping(value = "/savePurchaseRequest")
	public Mono<PurchaseRequest> savePurchaseRequest(@RequestBody PurchaseRequest purchaseRequest){
		return purchaseRequestService.savePurchaseRequest(purchaseRequest);
	}

}
