package com.lucasweb.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasweb.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
