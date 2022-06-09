package com.api.labClinico.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.labClinico.models.SclTipoContacto;
import com.api.labClinico.repository.TipoContactoRepository;

@Service
public class TipoContactoService
{
    @Autowired
    private TipoContactoRepository paisrepositorio;
    
    public SclTipoContacto insertar(SclTipoContacto a_obj)
    { return paisrepositorio.save(a_obj); }
    
    public SclTipoContacto actualizar(SclTipoContacto a_obj)
    { return paisrepositorio.save(a_obj); }
    
    public List<SclTipoContacto> listar()
    { return paisrepositorio.findAll(); }
    
    public void eliminar(SclTipoContacto a_obj)
    { paisrepositorio.delete(a_obj); }
}

