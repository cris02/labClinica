package com.api.labClinico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.labClinico.models.SclRangoEdad;
import com.api.labClinico.service.RangoEdadService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/rangos")
public class RangoEdadController {
	
	@Autowired
	private RangoEdadService servicio;
	
	@GetMapping("/all")
	public List<SclRangoEdad> listar() {
		return servicio.listaRangos();
	}
}
