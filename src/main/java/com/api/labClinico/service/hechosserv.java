package com.api.labClinico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.labClinico.models.SclHechoEpidemiologia;
import com.api.labClinico.models.SclHechoEpidemiologiaPK;
import com.api.labClinico.models.SclHechoSangre;
import com.api.labClinico.models.SclHechoSangrePK;
import com.api.labClinico.models.SclHechosArea;
import com.api.labClinico.models.SclHechosAreaPK;
import com.api.labClinico.repository.HechoEpidemRepository;
import com.api.labClinico.repository.HechoSangreRepository;
import com.api.labClinico.repository.HechosAreaRepository;

@Service
public class hechosserv {
	
	@Autowired
	private HechosAreaRepository  hechoarearepo;
	@Autowired
	private HechoEpidemRepository hechoepidemrepo;
	@Autowired
	private HechoSangreRepository hechosangrerepo;
	
	// Metodos select
	public List<SclHechosArea> listarHechosArea() {
		return hechoarearepo.findAll();
	}
	
	public SclHechosArea listarHechosArea(SclHechosAreaPK pk) {
		return hechoarearepo.findById(pk).orElse(null);
	}
	
	public List<SclHechoEpidemiologia> listarHechosEpidem() {
		return hechoepidemrepo.findAll();
	}
	
	public SclHechoEpidemiologia listarHechosEpidem(SclHechoEpidemiologiaPK pk) {
		return hechoepidemrepo.findById(pk).orElse(null);
	}
	
	public List<SclHechoSangre> listarHechosSangre() {
		return hechosangrerepo.findAll();
	}
	
	public SclHechoSangre listarHechosSangre(SclHechoSangrePK pk) {
		return hechosangrerepo.findById(pk).orElse(null);
	}
	
	//Metodos insert
	public SclHechosArea insertarHechoArea(SclHechosArea hecho) {
		return hechoarearepo.save(hecho);
	}

	public SclHechoEpidemiologia insertarHechoEpidem(SclHechoEpidemiologia hecho) {
		return hechoepidemrepo.save(hecho);
	}

	public SclHechoSangre insertarHechoSangre(SclHechoSangre hecho) {
		return hechosangrerepo.save(hecho);
	}
	
	//Metodos update
	public SclHechosArea actualizarHechoArea(SclHechosArea hecho) {
		return hechoarearepo.save(hecho);
	}

	public SclHechoEpidemiologia actualizarHechoEpidem(SclHechoEpidemiologia hecho) {
		return hechoepidemrepo.save(hecho);
	}

	public SclHechoSangre actualizarHechoSangre(SclHechoSangre hecho) {
		return hechosangrerepo.save(hecho);
	}
	
	//Metodos delete
	public void eliminarHechoArea(SclHechosArea hecho) {
		hechoarearepo.deleteById(hecho.getSclHechosAreaPK());
	}
	
	public void eliminarHechoEpidem(SclHechoEpidemiologia hecho) {
		hechoepidemrepo.deleteById(hecho.getSclHechoEpidemiologiaPK());
	}
	
	public void eliminarHechoSangre(SclHechoSangre hecho) {
		hechosangrerepo.deleteById(hecho.getSclHechoSangrePK());
	}
}
