package com.api.labClinico.controller;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.labClinico.models.SclOrdendeexamen;
import com.api.labClinico.models.VExamenes;
import com.api.labClinico.request.OrdenExamenRequest;
import com.api.labClinico.service.OrdenDeExamenServ;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/orden")
public class OrdenExamenController {
	
	@SuppressWarnings("unused")
	private final static Logger LOG = org.slf4j.LoggerFactory.getLogger(OrdenExamenController.class);
	
	@Autowired
	private OrdenDeExamenServ servicio;
	
	@GetMapping("/all")
    public List<SclOrdendeexamen> listar() { 
		List<SclOrdendeexamen> listOrdenes =  servicio.listar();
		for (SclOrdendeexamen sclOrdendeexamen : listOrdenes) {
			sclOrdendeexamen.setPacienteId(sclOrdendeexamen.getIdPaciente().getIdPaciente());
		}
		return  listOrdenes;
	}
	
	@GetMapping("/find") //?id=
    public SclOrdendeexamen listarId(@RequestParam Integer id)
    { return servicio.listarId(id); }
	
	@GetMapping("/findPaciente") //?id=
    public List<SclOrdendeexamen> listarIdPaciente(@RequestParam Integer id)
    { return servicio.listarOrdenPaciente(id); }
    
	
    @PostMapping("/save")
    public SclOrdendeexamen insertar(@RequestBody OrdenExamenRequest orden)
    { return servicio.insertar(orden); }
    
    
    @PutMapping("/upd")
    public SclOrdendeexamen actualizar(@RequestBody OrdenExamenRequest orden)
    { return servicio.actualizar(orden); }
    
    
    @DeleteMapping("/del")
    public void eliminar(@RequestParam Integer id)
    { servicio.eliminar(id); }
    
    
    @GetMapping("/listarExamen/{id}")
    public List<VExamenes> listarExamen(@PathVariable Integer id) {
    	return servicio.listarExamenes(id);
    }
}
