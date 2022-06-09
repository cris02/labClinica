package com.api.labClinico.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.labClinico.models.SclTipoDocumento;
import com.api.labClinico.repository.TipoDocumentoRepository;

@Service
public class TipoDocumentoService
{
    @Autowired
    private TipoDocumentoRepository tipodocumentopositorio;
    
    public SclTipoDocumento insertar(SclTipoDocumento obj)
    { return tipodocumentopositorio.save(obj); }
    
    public SclTipoDocumento actualizar(SclTipoDocumento obj)
    { return tipodocumentopositorio.save(obj); }
    
    public List<SclTipoDocumento> listar()
    { return tipodocumentopositorio.findAll(); }
    
    public SclTipoDocumento listarId(Integer id) {
    	return tipodocumentopositorio.findById(id).orElse(null);
    }
    
    public void eliminar(SclTipoDocumento obj)
    { tipodocumentopositorio.delete(obj); }
}
