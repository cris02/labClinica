package com.api.labClinico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.labClinico.models.SclTipoDocumento;

@Repository
public interface TipoDocumentoRepository extends JpaRepository <SclTipoDocumento, Integer> {
    
}
