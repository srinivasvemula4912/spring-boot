package com.vl.orderservice.api.common;

import com.vl.orderservice.api.entity.Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionResponce {

	private Order order;
	private double price;
	private String transactionId;
	private String message;
}
