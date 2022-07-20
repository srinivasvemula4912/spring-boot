package com.vl.orderservice.api.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vl.orderservice.api.common.TransactionRequest;
import com.vl.orderservice.api.common.TransactionResponce;
import com.vl.orderservice.api.entity.Order;
import com.vl.orderservice.api.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService service;
	
	@PostMapping("/bookOrder")
	public TransactionResponce bookOrder(@RequestBody TransactionRequest request) {
		
		return service.saveOrder(request); 
	}

}
