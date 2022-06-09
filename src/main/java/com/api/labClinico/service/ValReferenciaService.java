package com.api.labClinico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.labClinico.models.SclValreferencia;
import com.api.labClinico.repository.ValreferenciaRepository;

@Service
public class ValReferenciaService {
	
	@Autowired
	private ValreferenciaRepository repositorio;
    

    public List<SclValreferencia> listar()
    { return repositorio.findAll(); }
    
    public SclValreferencia insertar(SclValreferencia obj)
    { return repositorio.save(obj); }
    
    public SclValreferencia actualizar(SclValreferencia obj)
    { return repositorio.save(obj); }
    
    public void eliminar(SclValreferencia obj)
    { repositorio.delete(obj); }
}
