package com.vl.paymentservice.api.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vl.paymentservice.api.entity.Payment;
import com.vl.paymentservice.api.repository.PaymentRepository;

@Service
public class PaymentService {

	@Autowired
	private PaymentRepository repository;

	public Payment doPayment(Payment payment) {

		payment.setTransactionId(UUID.randomUUID().toString());
		payment.setPaymentStatus(paymentProcessing());
		return repository.save(payment);
	}

	public String paymentProcessing() {

		return new Random().nextBoolean()? "Success" : "Failed";

	}
}
