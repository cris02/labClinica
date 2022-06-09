package com.api.labClinico.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.labClinico.models.SclDepartamento;
import com.api.labClinico.models.SclDepartamentoPK;
import com.api.labClinico.repository.DepartamentoRepository;

@Service
public class DepartamentoService
{
    @Autowired
    private DepartamentoRepository repo;
    
    public List<SclDepartamento> listar()
    { return repo.findAll(); }
    
    public SclDepartamento listarId(SclDepartamentoPK pk)
    { return repo.findById(pk).orElse(null); }
    
    public SclDepartamento insertar(SclDepartamento d)
    { return repo.save(d); }
    
    public SclDepartamento actualizar(SclDepartamento d)
    { return repo.save(d); }
    
    public void eliminar(SclDepartamento d)
    { repo.delete(d); }
}

