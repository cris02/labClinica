package com.api.labClinico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.labClinico.models.SclClinica;
import com.api.labClinico.repository.ClinicaRepository;

@Service
public class ClinicaService {
	
	@Autowired
	private ClinicaRepository clinicaRepo;
	
	public List<SclClinica> listar() {
		 return clinicaRepo.findAll();
	 }
	 
	 public SclClinica findById (Integer id) {
	    	return clinicaRepo.findById(id).orElse(null);
	    }
	 
	 public void delete (Integer id) {
		 clinicaRepo.deleteById(id);
	    }
	 
	 public SclClinica save(SclClinica clinica) {
		 return clinicaRepo.save(clinica);
	 }

}
