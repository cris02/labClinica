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

import com.api.labClinico.models.SclDepartamento;
import com.api.labClinico.models.SclDepartamentoPK;
import com.api.labClinico.service.DepartamentoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/depto")
public class DepartamentoController {
	
	@Autowired
	private DepartamentoService servicio;
	
	@GetMapping("/all")
    public List<SclDepartamento> listar()
    { return servicio.listar(); }
	
	@GetMapping("/find") //?p= .... &d=
    public SclDepartamento listarId(@RequestParam String p, Integer d)
    { return servicio.listarId(new SclDepartamentoPK(p, d)); }
    
    @PostMapping
    public SclDepartamento insertar(@RequestBody SclDepartamento usu)
    { return servicio.insertar(usu); }
    
    @PutMapping
    public SclDepartamento actualizar(@RequestBody SclDepartamento a_obj)
    { return servicio.actualizar(a_obj); }
    
    @DeleteMapping
    public void eliminar(@RequestBody SclDepartamento a_obj)
    { servicio.eliminar(a_obj); }
}
