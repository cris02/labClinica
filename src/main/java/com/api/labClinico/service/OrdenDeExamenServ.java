package com.api.labClinico.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.labClinico.models.SclOrdendeexamen;
import com.api.labClinico.repository.OrdenDeExamenRepository;
import com.api.labClinico.repository.PacienteRepository;

@Service
public class OrdenDeExamenServ
{
    @Autowired
    private OrdenDeExamenRepository repositorio;
    @Autowired
    private PacienteRepository pacienterepo;
    

    public List<SclOrdendeexamen> listar()
    { return repositorio.findAll(); }
    
    public SclOrdendeexamen listarId(Integer id)
    { return repositorio.findById(id).orElse(null); }
    
    public List<SclOrdendeexamen> listarOrdenPaciente(Integer id)
    { return repositorio.findByIdPaciente(pacienterepo.findById(id).orElse(null)); }
    
    public SclOrdendeexamen insertar(SclOrdendeexamen a_obj)
    { return repositorio.save(a_obj); }
    
    public SclOrdendeexamen actualizar(SclOrdendeexamen a_obj)
    { return repositorio.save(a_obj); }
    
    public void eliminar(SclOrdendeexamen a_obj)
    { repositorio.delete(a_obj); }
}

