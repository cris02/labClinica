package com.api.labClinico.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.labClinico.models.SclRol;
import com.api.labClinico.repository.RolRepository;

@Service
public class RolService
{
    @Autowired
    private RolRepository paisrepositorio;
    
    public SclRol insertar(SclRol a_obj)
    { return paisrepositorio.save(a_obj); }
    
    public SclRol actualizar(SclRol a_obj)
    { return paisrepositorio.save(a_obj); }
    
    public List<SclRol> listar()
    { return paisrepositorio.findAll(); }
    
    public void eliminar(SclRol a_obj)
    { paisrepositorio.delete(a_obj); }
}

