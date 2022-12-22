package com.bootcamp.event;


import com.bootcamp.entity.PurchaseRequest;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class PurchaseCreatedEvent extends Event<PurchaseRequest> {

}
