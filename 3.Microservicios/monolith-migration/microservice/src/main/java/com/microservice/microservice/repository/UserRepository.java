package com.microservice.microservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.microservice.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByNick(String nick);

}
