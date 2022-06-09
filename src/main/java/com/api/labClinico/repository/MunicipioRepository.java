package com.api.labClinico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.labClinico.models.SclMunicipio;
import com.api.labClinico.models.SclMunicipioPK;

@Repository
public interface MunicipioRepository extends JpaRepository <SclMunicipio, SclMunicipioPK>
{
    
    
}
