package com.api.labClinico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.labClinico.models.SclOrdendeexamen;
import com.api.labClinico.service.OrdenDeExamenServ;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/orden")
public class OrdenExamenController {
	
	@Autowired
	private OrdenDeExamenServ servicio;
	
	@GetMapping("/all")
    public List<SclOrdendeexamen> listar() { 
		List<SclOrdendeexamen> listOrdenes =  servicio.listar();
		for (SclOrdendeexamen examen : listOrdenes) {
			examen.setPacienteId(examen.getIdPaciente().getIdPaciente());
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
    public SclOrdendeexamen insertar(@RequestBody SclOrdendeexamen usu)
    { return servicio.insertar(usu); }
    
    @PutMapping("/upd")
    public SclOrdendeexamen actualizar(@RequestBody SclOrdendeexamen a_obj)
    { return servicio.actualizar(a_obj); }
    
    @DeleteMapping("del")
    public void eliminar(@RequestBody SclOrdendeexamen a_obj)
    { servicio.eliminar(a_obj); }
}
