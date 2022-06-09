package com.api.labClinico.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.labClinico.models.SclClasificacionAnexo;
import com.api.labClinico.repository.ClasificacionAnexoRepository;

@Service
public class ClasificacionAnexoServ
{
    @Autowired
    private ClasificacionAnexoRepository paisrepositorio;
    
    public SclClasificacionAnexo insertar(SclClasificacionAnexo a_obj)
    { return paisrepositorio.save(a_obj); }
    
    public SclClasificacionAnexo actualizar(SclClasificacionAnexo a_obj)
    { return paisrepositorio.save(a_obj); }
    
    public List<SclClasificacionAnexo> listar()
    { return paisrepositorio.findAll(); }
    
    public void eliminar(SclClasificacionAnexo a_obj)
    { paisrepositorio.delete(a_obj); }
}

