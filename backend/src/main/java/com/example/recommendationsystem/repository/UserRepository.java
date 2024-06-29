package com.example.recommendationsystem.repository;

import com.example.recommendationsystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

