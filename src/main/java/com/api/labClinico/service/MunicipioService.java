package com.api.labClinico.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.labClinico.models.SclMunicipio;
import com.api.labClinico.models.SclMunicipioPK;
import com.api.labClinico.repository.MunicipioRepository;

@Service
public class MunicipioService
{
    @Autowired
    private MunicipioRepository repo;
    
    public List<SclMunicipio> listar()
    { return repo.findAll(); }
    
    public SclMunicipio listarId(SclMunicipioPK pk)
    { return repo.findById(pk).orElse(null); }
    
    public SclMunicipio insertar(SclMunicipio muni)
    { return repo.save(muni); }
    
    public SclMunicipio actualizar(SclMunicipio muni)
    { return repo.save(muni); }
    
    public void eliminar(SclMunicipio muni)
    { repo.delete(muni); }

}

