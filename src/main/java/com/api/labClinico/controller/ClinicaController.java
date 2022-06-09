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
import com.api.labClinico.models.SclClinica;
import com.api.labClinico.request.ClinicaRequest;
import com.api.labClinico.service.ClinicaService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/clinica")
public class ClinicaController {
	
	@Autowired
	private  ClinicaService clinicaService;
	
	@GetMapping("/all")
	 public List<SclClinica> listar() {
		 return clinicaService.listar();
	 }
	 
	 @GetMapping("find/{id}")
	 public SclClinica show (@RequestParam Integer id) {
		 return clinicaService.findById(id);
	 }
	 
	 @PostMapping("/save")
	 public SclClinica guardar (@RequestBody ClinicaRequest clinica) {
		 SclClinica newClinica = new SclClinica();
		 
		 newClinica.setNomClinica(clinica.getNomClinica());
		 newClinica.setTelClinica(clinica.getTelClinica());
		 
		 return clinicaService.save(newClinica);
	 }
	 
	 @PutMapping("/upd")
	 public SclClinica update (@RequestBody ClinicaRequest clinica, @RequestParam Integer id ) {
		 SclClinica clinicaActual = clinicaService.findById(id);
		 
		 clinicaActual.setNomClinica(clinica.getNomClinica());
		 clinicaActual.setTelClinica(clinica.getTelClinica());
		 
		 return clinicaService.save(clinicaActual);
	 }
	 
	 @DeleteMapping("/del")
	 public void delete(@RequestParam Integer id) {
		 clinicaService.delete(id);
	 }

}
