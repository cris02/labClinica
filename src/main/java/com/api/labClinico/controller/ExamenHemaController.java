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

import com.api.labClinico.models.SclExamenhematologia;
import com.api.labClinico.models.SclExamenhematologiaPK;
import com.api.labClinico.service.ExamenService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/examen")
public class ExamenHemaController {
	
	@Autowired
	private ExamenService servicio;
	
	@GetMapping("/hma")
	public List<SclExamenhematologia> listarHematologia() {
		return servicio.listarHema();
	}
	
	@GetMapping("/hma/find") //?o= ... & e= ...
	public SclExamenhematologia listarHematologia(@RequestParam Integer o, Integer e) {
		return servicio.listarHemaId(new SclExamenhematologiaPK(o,e));
	}
	
	@PostMapping("/hma/save")
	public void insertar(@RequestBody SclExamenhematologia e) {
		servicio.insertar(e);
	}
	
	@PutMapping("/hma/upd")
	public void actualizar(@RequestBody SclExamenhematologia e) {
		servicio.actualizar(e);
	}
	
	@DeleteMapping("/hma/del")
	public void eliminar(@RequestBody SclExamenhematologia e) {
		servicio.eliminar(e);
	}
}
