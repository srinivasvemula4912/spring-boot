package com.vl.paymentservice.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vl.paymentservice.api.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer>{

}
