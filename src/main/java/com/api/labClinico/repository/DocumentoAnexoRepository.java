package com.api.labClinico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.labClinico.models.SclDocumentoAnexo;
import com.api.labClinico.models.SclDocumentoAnexoPK;


@Repository
public interface DocumentoAnexoRepository extends JpaRepository <SclDocumentoAnexo, SclDocumentoAnexoPK>
{
    
    
}
