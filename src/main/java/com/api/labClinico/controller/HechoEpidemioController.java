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

import com.api.labClinico.models.SclHechoEpidemiologia;
import com.api.labClinico.service.hechosserv;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/hechoepi")
public class HechoEpidemioController {
	
	@Autowired
	private hechosserv servicio;
	

	@GetMapping("/all")
	public List<SclHechoEpidemiologia> listar() {
		return servicio.listarHechosEpidem();
	}
	
	@GetMapping("/find")
	public List<SclHechoEpidemiologia> listar(String a) {
		return servicio.listarHechosEpidem();
	}
	
	@PostMapping("/save")
	public SclHechoEpidemiologia guardar(@RequestBody SclHechoEpidemiologia h) {
		return servicio.insertarHechoEpidem(h);
	}
	
	@PutMapping("/upd")
	public SclHechoEpidemiologia actualizar(@RequestBody SclHechoEpidemiologia h) {
		return servicio.actualizarHechoEpidem(h);
	}
	
	@DeleteMapping("/del")
	public void eliminar(@RequestBody SclHechoEpidemiologia h) {
		servicio.eliminarHechoEpidem(h);
	}
}
