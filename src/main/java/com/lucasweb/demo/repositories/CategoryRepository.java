package com.lucasweb.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasweb.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
