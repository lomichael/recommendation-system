package com.example.recommendationsystem.repository;

import com.example.recommendationsystem.model.Content;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentRepository extends JpaRepository<Content, Long> {
}

