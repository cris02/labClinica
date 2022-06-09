package com.api.labClinico.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.api.labClinico.models.SclClinica;
import com.api.labClinico.request.ClinicaRequest;
import com.api.labClinico.service.ClinicaService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/clinica")
public class ClinicaController {
	
	@Autowired
	private  ClinicaService clinicaService;
	
	@GetMapping("/listar")
	 public List<SclClinica> listar() {
		 return clinicaService.listar();
	 }
	 
	 @GetMapping("show/{id}")
	 public SclClinica show (@PathVariable Integer id) {
		 return clinicaService.findById(id);
	 }
	 
	 @PostMapping("/guardar")
	 public SclClinica guardar (@RequestBody ClinicaRequest clinica) {
		 SclClinica newClinica = new SclClinica();
		 
		 newClinica.setNomClinica(clinica.getNomClinica());
		 newClinica.setTelClinica(clinica.getTelClinica());
		 
		 return clinicaService.save(newClinica);
	 }
	 
	 @PutMapping("/update/{id}")
	 public SclClinica update (@RequestBody   ClinicaRequest clinica, @PathVariable Integer id ) {
		 SclClinica clinicaActual = clinicaService.findById(id);
		 
		 clinicaActual.setNomClinica(clinica.getNomClinica());
		 clinicaActual.setTelClinica(clinica.getTelClinica());
		 
		 return clinicaService.save(clinicaActual);
	 }
	 
	 @DeleteMapping("/delete/{id}")
	 public void delete(@PathVariable Integer id) {
		 clinicaService.delete(id);
	 }

}
