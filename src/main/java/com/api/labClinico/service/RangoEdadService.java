package com.api.labClinico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.labClinico.models.SclRangoEdad;
import com.api.labClinico.repository.RangoEdadRepository;

@Service
public class RangoEdadService {
	
	@Autowired
	private RangoEdadRepository rangoedadrepo;
	
	
	public List<SclRangoEdad> listaRangos(){
		return rangoedadrepo.findAll();
	}
}
