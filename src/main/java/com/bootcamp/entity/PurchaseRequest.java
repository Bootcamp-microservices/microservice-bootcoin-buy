package com.bootcamp.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(value = "purchaseRequest")
public class PurchaseRequest {

	@Id
	private ObjectId id;
	private ObjectId idSalesRequest;
    private Double amount;
    private int typePay;
    //Para typePay codigo 1
    private String numberAccount;
    //Para typePay codigo 2
    private String cellPhoneNumber;
    private ObjectId idBuyer;
   
}
