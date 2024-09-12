package com.lucasweb.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasweb.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
