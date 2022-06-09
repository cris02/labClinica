package com.api.labClinico.service;

//import com.swrest.model.SclDocumentoAnexoPK;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.labClinico.models.SclDocumentoAnexo;
import com.api.labClinico.repository.DocumentoAnexoRepository;

@Service
public class DocumentoAnexoService
{
    @Autowired
    private DocumentoAnexoRepository paisrepositorio;
    
    public SclDocumentoAnexo insertar(SclDocumentoAnexo a_obj)
    { return paisrepositorio.save(a_obj); }
    
    public SclDocumentoAnexo actualizar(SclDocumentoAnexo a_obj)
    { return paisrepositorio.save(a_obj); }
    
    public List<SclDocumentoAnexo> listar()
    { return paisrepositorio.findAll(); }
    
    public void eliminar(SclDocumentoAnexo a_obj)
    { paisrepositorio.delete(a_obj); }
}

