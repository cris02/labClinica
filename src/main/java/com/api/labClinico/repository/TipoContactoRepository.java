package com.api.labClinico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.labClinico.models.SclTipoContacto;

@Repository
public interface TipoContactoRepository extends JpaRepository <SclTipoContacto, Integer> {
    
    
}
