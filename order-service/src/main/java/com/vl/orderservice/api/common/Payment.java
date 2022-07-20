package com.vl.orderservice.api.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {

	private int orderId;
	private String paymentStatus;
	private String transactionId;
	private double price;
}
