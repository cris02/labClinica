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

import com.api.labClinico.models.SclMunicipio;
import com.api.labClinico.models.SclMunicipioPK;
import com.api.labClinico.service.MunicipioService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/municipio")
public class MunicipioController {
	
	@Autowired
	private MunicipioService servicio;
	

	@GetMapping("/all")
    public List<SclMunicipio> listar()
    { return servicio.listar(); }
	
	@GetMapping("/find")
    public SclMunicipio listar(@RequestParam String p, Integer d, Integer m)
    { return servicio.listarId(new SclMunicipioPK(p,d,m)); }
    
    @PostMapping
    public SclMunicipio insertar(@RequestBody SclMunicipio usu)
    { return servicio.insertar(usu); }
    
    @PutMapping
    public SclMunicipio actualizar(@RequestBody SclMunicipio a_obj)
    { return servicio.actualizar(a_obj); }
    
    @DeleteMapping
    public void eliminar(@RequestBody SclMunicipio a_obj)
    { servicio.eliminar(a_obj); }
}
