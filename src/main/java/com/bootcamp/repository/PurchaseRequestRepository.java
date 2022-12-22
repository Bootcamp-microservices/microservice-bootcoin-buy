package com.bootcamp.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.bootcamp.entity.PurchaseRequest;

public interface PurchaseRequestRepository extends ReactiveMongoRepository<PurchaseRequest, ObjectId> {

}
