package com.lucasweb.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasweb.demo.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
