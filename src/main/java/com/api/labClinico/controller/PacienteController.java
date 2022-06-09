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

import com.api.labClinico.models.SclPaciente;
import com.api.labClinico.service.PacienteService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/paciente")
public class PacienteController {
	
	@Autowired 
	private PacienteService servicio;
	
	@GetMapping("/all")
	public List<SclPaciente> listar() {
		return servicio.listar();
	}
	
	@GetMapping("/find") //?id=
	public SclPaciente listarId(@RequestParam Integer id) {
		return servicio.listarId(id);
	}
	
	@PostMapping("/save")
	public void insertar(@RequestBody SclPaciente pac) {
		servicio.insertar(pac);
	}
	
	@PutMapping("/upd")
	public void actualizar(@RequestBody SclPaciente pac) {
		servicio.actualizar(pac);
	}
	
	@DeleteMapping("/del")
	public void eliminar(@RequestBody SclPaciente pac) {
		servicio.eliminar(pac);
	}
}
