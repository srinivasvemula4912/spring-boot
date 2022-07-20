package com.vl.orderservice.api.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ORDER_TB")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

	@Id
	private int id;
	private String name;
	private int qty;
	private double price;
}
