package com.codeclan.example.teaservice.repository;

import com.codeclan.example.teaservice.models.Tea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeaRepository extends JpaRepository<Tea, Long > {
}

