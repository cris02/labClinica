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

import com.api.labClinico.models.SclAreadelaboratorio;
import com.api.labClinico.service.AreaDeLaboratorioService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/area")
public class AreaDeLabController {
	
	@Autowired
	private AreaDeLaboratorioService servicio;
	
	@GetMapping("/all")
	public List<SclAreadelaboratorio> listar() {
		return servicio.listar();
	}

	@PostMapping("/save")
	public SclAreadelaboratorio insertar(@RequestBody SclAreadelaboratorio a) {
		return servicio.insertar(a);
	}

	@PutMapping("/upd")
	public SclAreadelaboratorio actualizar(@RequestBody SclAreadelaboratorio a)
	{	return servicio.actualizar(a);	}
	
	@DeleteMapping("/del")
	public void eliminar(@RequestBody SclAreadelaboratorio a)
	{	servicio.eliminar(a);	}
}
