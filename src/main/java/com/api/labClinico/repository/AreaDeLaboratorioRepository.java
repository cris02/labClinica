package com.api.labClinico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.labClinico.models.SclAreadelaboratorio;

@Repository
public interface AreaDeLaboratorioRepository extends JpaRepository <SclAreadelaboratorio, Integer>
{
    
    
}
