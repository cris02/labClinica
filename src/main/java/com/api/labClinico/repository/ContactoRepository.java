package com.api.labClinico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.labClinico.models.SclContacto;
import com.api.labClinico.models.SclContactoPK;


@Repository
public interface ContactoRepository extends JpaRepository <SclContacto, SclContactoPK>
{
    
    
}
