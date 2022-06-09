package com.api.labClinico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.labClinico.models.SclDepartamento;
import com.api.labClinico.models.SclDepartamentoPK;

@Repository
public interface DepartamentoRepository extends JpaRepository <SclDepartamento, SclDepartamentoPK>
{
    
    
}
