package com.marcos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcos.model.Anomalia;

@Repository
public interface AnomaliaRepository extends JpaRepository<Anomalia, Long> {
    
}
