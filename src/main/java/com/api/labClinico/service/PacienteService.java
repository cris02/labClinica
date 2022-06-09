package com.api.labClinico.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.labClinico.models.SclPaciente;
import com.api.labClinico.repository.PacienteRepository;

@Service
public class PacienteService
{
    @Autowired
    private PacienteRepository pacienterepositorio;

    public List<SclPaciente> listar()
    { return pacienterepositorio.findAll(); }
    
    public SclPaciente listarId(Integer id) {
    	return pacienterepositorio.findById(id).orElse(null);
    }
    
    
    public SclPaciente insertar(SclPaciente pac)
    {	return pacienterepositorio.save(pac);	}
    
    
    public SclPaciente actualizar(SclPaciente pac)
    { 
    	if(pacienterepositorio.existsById(pac.getIdPaciente()))
    		return pacienterepositorio.save(pac);
    	else
    		return null;
    }
    
    
    public void eliminar(SclPaciente pac)
    { 
    	if(pacienterepositorio.existsById(pac.getIdPaciente()))
    		pacienterepositorio.delete(pac);
    }
}

