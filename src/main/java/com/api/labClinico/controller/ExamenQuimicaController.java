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

import com.api.labClinico.models.SclExamenquimicaclinica;
import com.api.labClinico.models.SclExamenquimicaclinicaPK;
import com.api.labClinico.service.ExamenService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/examen")
public class ExamenQuimicaController {
	
	@Autowired
	private ExamenService servicio;

	@GetMapping("/qcl")
	public List<SclExamenquimicaclinica> listarQuimica() {
		return servicio.listarQcl();
	}
	
	@GetMapping("/qcl/find") //?o= ... &e= ...
	public SclExamenquimicaclinica listarQuimica(@RequestParam Integer o, Integer e) {
		return servicio.listarQclId(new SclExamenquimicaclinicaPK(o,e));
	}

	@PostMapping("/qcl/save")
	public void insertar(@RequestBody SclExamenquimicaclinica e) {
		servicio.insertar(e);
	}
	
	@PutMapping("/qcl/upd")
	public void actualizar(@RequestBody SclExamenquimicaclinica e) {
		servicio.actualizar(e);
	}
	
	@DeleteMapping("/qcl/del")
	public void eliminar(@RequestBody SclExamenquimicaclinica e) {
		servicio.eliminar(e);
	}
}
