package com.api.labClinico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.labClinico.models.SclPaciente;

@Repository
public interface PacienteRepository extends JpaRepository <SclPaciente, Integer> {
    
    
}
