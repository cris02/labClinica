package com.api.labClinico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.labClinico.models.SclClasificacionAnexo;

@Repository
public interface ClasificacionAnexoRepository extends JpaRepository <SclClasificacionAnexo, Integer>
{
    
    
}
