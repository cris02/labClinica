package com.api.labClinico.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.labClinico.models.SclOpcionmenu;
import com.api.labClinico.repository.OpcionMenuRepository;

@Service
public class OpcionMenuService
{
    @Autowired
    private OpcionMenuRepository paisrepositorio;
    
    public SclOpcionmenu insertar(SclOpcionmenu a_obj)
    { return paisrepositorio.save(a_obj); }
    
    public SclOpcionmenu actualizar(SclOpcionmenu a_obj)
    { return paisrepositorio.save(a_obj); }
    
    public List<SclOpcionmenu> listar()
    { return paisrepositorio.findAll(); }
    
    public void eliminar(SclOpcionmenu a_obj)
    { paisrepositorio.delete(a_obj); }
}

