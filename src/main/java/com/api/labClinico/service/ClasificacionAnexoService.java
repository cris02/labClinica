package com.api.labClinico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.labClinico.models.SclClasificacionAnexo;
import com.api.labClinico.repository.ClasificacionAnexoRepository;

@Service
public class ClasificacionAnexoService {
	
	@Autowired
	private ClasificacionAnexoRepository anexoRepo;
	
	public List<SclClasificacionAnexo> listar() {
		 return anexoRepo.findAll();
	 }
	 
	 public SclClasificacionAnexo findById (Integer id) {
	    	return anexoRepo.findById(id).orElse(null);
	    }
	 
	 public void delete (Integer id) {
		 anexoRepo.deleteById(id);
	    }
	 
	 public SclClasificacionAnexo save(SclClasificacionAnexo anexo) {
		 return anexoRepo.save(anexo);
	 }

}
