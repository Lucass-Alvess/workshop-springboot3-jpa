package com.lucasweb.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasweb.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
