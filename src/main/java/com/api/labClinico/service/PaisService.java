package com.api.labClinico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.labClinico.models.SclPais;
import com.api.labClinico.repository.PaisRepository;

@Service
public class PaisService {
	
	@Autowired
	private PaisRepository paisRepo;
	
	 public List<SclPais> listar() {
		 return paisRepo.findAll();
	 }
	 
	 public SclPais findById (String id) {
	    	return paisRepo.findById(id).orElse(null);
	    }
	 
	 public void delete (String id) {
		 paisRepo.deleteById(id);
	    }
	 
	 public SclPais save(SclPais pais) {
		 return paisRepo.save(pais);
	 }

}
