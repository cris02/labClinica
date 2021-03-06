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

import com.api.labClinico.models.SclExamencoprologia;
import com.api.labClinico.models.SclExamencoprologiaPK;
import com.api.labClinico.service.ExamenService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/examen")
public class ExamenCoproController {
	
	@Autowired
	private ExamenService servicio;
	
	@GetMapping("/cpl")
	public List<SclExamencoprologia> listarCoprologia() {
		return servicio.listarCopro();
	}
	
	@GetMapping("/cpl/find") //?o= ... &e= ...
	public SclExamencoprologia listarCoprologia(@RequestParam Integer o, Integer e) {
		return servicio.listarCoproId(new SclExamencoprologiaPK(o,e));
	}
	
	@PostMapping("/cpl/save")
	public void insertar(@RequestBody SclExamencoprologia e) {
		servicio.insertar(e);
	}
	
	@PutMapping("/cpl/upd")
	public void actualizar(@RequestBody SclExamencoprologia e) {
		servicio.actualizar(e);
	}
	
	@DeleteMapping("/cpl/del")
	public void eliminar(@RequestBody SclExamencoprologia e) {
		servicio.eliminar(e);
	}
}
