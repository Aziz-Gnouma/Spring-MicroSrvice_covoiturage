package com.javatechie.repository;

import com.javatechie.entity.UserApp;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserCredentialRepository  extends JpaRepository<UserApp,Integer> {
    Optional<UserApp> findByName(String username);
}
