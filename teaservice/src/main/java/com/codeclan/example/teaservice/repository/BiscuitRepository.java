package com.codeclan.example.teaservice.repository;

import com.codeclan.example.teaservice.models.Biscuit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BiscuitRepository extends JpaRepository<Biscuit, Long > {
}
