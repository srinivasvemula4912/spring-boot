package com.vl.paymentservice.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PAYMENT")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

	@Id
	@GeneratedValue
	private int paymentId;
	private String paymentStatus;
	private String transactionId;
	private int orderId;
	private double price;

}
