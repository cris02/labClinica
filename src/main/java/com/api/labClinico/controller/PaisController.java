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

import com.api.labClinico.models.SclPais;
import com.api.labClinico.request.PaisRequest;
import com.api.labClinico.service.PaisService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/pais")
public class PaisController {
	
	 @Autowired
	 private PaisService paisService;
	 
	 @GetMapping("/listar")
	 public List<SclPais> listar() {
		 return paisService.listar();
	 }
	 
	 @GetMapping("show/{id}")
	 public SclPais show (@PathVariable String id) {
		 return paisService.findById(id);
	 }
	 
	 @PostMapping("/guardar")
	 public SclPais guardar (@RequestBody PaisRequest pais) {
		 SclPais newPais = new SclPais();
		 
		 newPais.setIdPais(pais.getIdPais());
		 newPais.setNomPais(pais.getNomPais());
		 newPais.setIdIso2(pais.getIdIso2());
		 
		 return paisService.save(newPais);
	 }
	 
	 @PutMapping("/update/{id}")
	 public SclPais update (@RequestBody  PaisRequest pais, @PathVariable String id ) {
		 SclPais paisActual = paisService.findById(id);
		 
		 paisActual.setIdPais(pais.getIdPais());
		 paisActual.setNomPais(pais.getNomPais());
		 paisActual.setIdIso2(pais.getIdIso2());
		 
		 return paisService.save(paisActual);
	 }
	 
	 @DeleteMapping("/delete/{id}")
	 public void delete(@PathVariable String id) {
		 paisService.delete(id);
	 }

}
