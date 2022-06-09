package com.api.labClinico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.labClinico.models.SclCita;

@Repository
public interface CitaRepository extends JpaRepository <SclCita, Integer>
{
    
    
}
