package com.api.labClinico.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.labClinico.models.SclContacto;
import com.api.labClinico.models.SclContactoPK;
import com.api.labClinico.repository.ContactoRepository;

@Service
public class ContactoService
{
    @Autowired
    private ContactoRepository repositorio;
    
    public List<SclContacto> listar()
    { return repositorio.findAll(); }
    
    public SclContacto listarId(SclContactoPK pk)
    { return repositorio.findById(pk).orElse(null); }
    
    public SclContacto insertar(SclContacto a_obj)
    { return repositorio.save(a_obj); }
    
    public SclContacto actualizar(SclContacto a_obj)
    { return repositorio.save(a_obj); }
    
    public void eliminar(SclContacto a_obj)
    { repositorio.delete(a_obj); }
}

