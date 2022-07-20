package com.vl.orderservice.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.vl.orderservice.api.common.Payment;
import com.vl.orderservice.api.common.TransactionRequest;
import com.vl.orderservice.api.common.TransactionResponce;
import com.vl.orderservice.api.entity.Order;
import com.vl.orderservice.api.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;

	@Autowired
	private RestTemplate template;

	public TransactionResponce saveOrder(TransactionRequest request) {

		String response = "";
		Order order = request.getOrder();
		Payment payment = request.getPayment();
		payment.setOrderId(order.getId());
		payment.setPrice(order.getPrice());

		Payment paymentResponce = template.postForObject("http://localhost:9192/payment/doPayment", payment,
				Payment.class);

		response = paymentResponce.getPaymentStatus().equals("Success") ? "payment processing is successfull"
				: "Payment failed and added to cart";

		repository.save(order);

		return new TransactionResponce(order, paymentResponce.getPrice(), paymentResponce.getTransactionId(), response);
	}

}
