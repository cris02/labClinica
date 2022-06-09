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

import com.api.labClinico.models.SclHechoSangre;
import com.api.labClinico.service.hechosserv;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/hechosangre")
public class HechoSangreController {
	
	@Autowired
	private hechosserv servicio;
	

	@GetMapping("/all")
	public List<SclHechoSangre> listar() {
		return servicio.listarHechosSangre();
	}
	
	@PostMapping("/save")
	public SclHechoSangre guardar(@RequestBody SclHechoSangre h) {
		return servicio.insertarHechoSangre(h);
	}
	
	@PutMapping("/upd")
	public SclHechoSangre actualizar(@RequestBody SclHechoSangre h) {
		return servicio.actualizarHechoSangre(h);
	}
	
	@DeleteMapping("/del")
	public void eliminar(@RequestBody SclHechoSangre h) {
		servicio.eliminarHechoSangre(h);
	}
}
