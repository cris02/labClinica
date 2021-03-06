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
import org.springframework.web.bind.annotation.RestController;

import com.api.labClinico.models.SclValreferencia;
import com.api.labClinico.service.ValReferenciaService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/vref")
public class ValReferenciaController {
	
	@Autowired
	private ValReferenciaService servicio;
	
	
	@GetMapping("/all")
	public List<SclValreferencia> listar() {
		return servicio.listar();
	}
	
	@PostMapping
    public SclValreferencia insertar(@RequestBody SclValreferencia a_obj)
    { return servicio.insertar(a_obj); }
    
    @PutMapping
    public SclValreferencia actualizar(@RequestBody SclValreferencia a_obj)
    { return servicio.actualizar(a_obj); }
    
    @DeleteMapping
    public void eliminar(@RequestBody SclValreferencia usu)
    { servicio.eliminar(usu); }
}
