package com.api.labClinico.service;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.labClinico.models.SclOrdendeexamen;
import com.api.labClinico.models.VExamenes;
import com.api.labClinico.repository.ExamenRepositoty;
import com.api.labClinico.repository.OrdenDeExamenRepository;
import com.api.labClinico.request.OrdenExamenRequest;

@Service
public class OrdenDeExamenServ
{
    @Autowired
    private OrdenDeExamenRepository repositorio;
    @Autowired
    private ExamenRepositoty examenRepo;
    @Autowired
    private PacienteService pacienteserv;

    public List<SclOrdendeexamen> listar()
    { return repositorio.findAll(); }
    
    public SclOrdendeexamen listarId(Integer id)
    { return repositorio.findById(id).orElse(null); }
    
    public List<SclOrdendeexamen> listarOrdenPaciente(Integer id)
    { return repositorio.findByIdPaciente(pacienteserv.listarId(id)); }
    
    public SclOrdendeexamen insertar(OrdenExamenRequest o) {
    	SclOrdendeexamen newOrden = new SclOrdendeexamen();
        
    	newOrden.setIdOrdenexamen( (int) repositorio.count() + 1000);
    	newOrden.setIdPaciente(pacienteserv.listarId(o.getIdPaciente()));
    	newOrden.setFechaMuestra(new Date());
    	newOrden.setHoraMuestra(new Date());
    	newOrden.setCantHeces(o.getCantHeces());
    	newOrden.setCantOrina(o.getCantOrina());
    	newOrden.setCantSangre(o.getCantSangre());
    	newOrden.setUniHeces(o.getUniHeces());
    	newOrden.setUniOrina(o.getUniOrina());
    	newOrden.setUniSangre(o.getUniSangre());
    	
    	return repositorio.save(newOrden);
    }
    
    public SclOrdendeexamen actualizar(OrdenExamenRequest o) {
    	if(repositorio.existsById(o.getIdOrdenexamen())) {
    		SclOrdendeexamen newOrden = new SclOrdendeexamen();
        	newOrden.setIdOrdenexamen(o.getIdOrdenexamen());
        	newOrden.setIdPaciente(pacienteserv.listarId(o.getIdPaciente()));
        	newOrden.setFechaMuestra(new Date());
        	newOrden.setHoraMuestra(new Date());
        	newOrden.setCantHeces(o.getCantHeces());
        	newOrden.setCantOrina(o.getCantOrina());
        	newOrden.setCantSangre(o.getCantSangre());
        	newOrden.setUniHeces(o.getUniHeces());
        	newOrden.setUniOrina(o.getUniOrina());
        	newOrden.setUniSangre(o.getUniSangre());
        	
        	return repositorio.save(newOrden);
    	}
    	else return null;
    }
    
    public void eliminar(Integer id) {
    	if(repositorio.existsById(id))
    		repositorio.deleteById(id);
    }
    
    //listar ordenes
    public List<VExamenes> listarExamenes(Integer id) {
    	return examenRepo.getExamenesPac(id);
    }
}

