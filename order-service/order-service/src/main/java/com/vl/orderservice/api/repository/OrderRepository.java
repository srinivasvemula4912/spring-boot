package com.vl.orderservice.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vl.orderservice.api.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{

}
