package com.api.labClinico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.labClinico.models.SclExamencoprologia;
import com.api.labClinico.models.SclExamencoprologiaPK;
import com.api.labClinico.models.SclExamenhematologia;
import com.api.labClinico.models.SclExamenhematologiaPK;
import com.api.labClinico.models.SclExamenquimicaclinica;
import com.api.labClinico.models.SclExamenquimicaclinicaPK;
import com.api.labClinico.models.SclExamenurianalisis;
import com.api.labClinico.models.SclExamenurianalisisPK;
import com.api.labClinico.repository.ExamenCoproRepository;
import com.api.labClinico.repository.ExamenHemaRepository;
import com.api.labClinico.repository.ExamenQumicaRepository;
import com.api.labClinico.repository.ExamenUrianalisisRepository;

@Service
public class ExamenService {
	
	@Autowired
	private ExamenCoproRepository repo_copro;
	@Autowired
    private ExamenUrianalisisRepository repo_uri;
	@Autowired
	private ExamenHemaRepository repo_hema;
	@Autowired
	private ExamenQumicaRepository repo_qcl;
	
	//Metodos select
	public List<SclExamencoprologia> listarCopro()
	{	return repo_copro.findAll();	}
	
	public SclExamencoprologia listarCoproId(SclExamencoprologiaPK pk)
	{	return repo_copro.findById(pk).orElse(null);	}
	
	public List<SclExamenurianalisis> listarUri()
    { 	return repo_uri.findAll();		}
	
	public SclExamenurianalisis listarUriId(SclExamenurianalisisPK pk)
	{	return repo_uri.findById(pk).orElse(null);	}
	
	public List<SclExamenhematologia> listarHema()
    { 	return repo_hema.findAll();		}
	
	public SclExamenhematologia listarHemaId(SclExamenhematologiaPK pk)
    { 	return repo_hema.findById(pk).orElse(null);		}
	
	public List<SclExamenquimicaclinica> listarQcl()
	{	return repo_qcl.findAll();		}
	
	public SclExamenquimicaclinica listarQclId(SclExamenquimicaclinicaPK pk)
    { 	return repo_qcl.findById(pk).orElse(null);		}
	
	//Metodos insert
	public SclExamencoprologia insertar(SclExamencoprologia co)
	{	return repo_copro.save(co);		}
	
	public SclExamenurianalisis insertar(SclExamenurianalisis uri) 
	{	return repo_uri.save(uri);		}
	
	public SclExamenhematologia insertar(SclExamenhematologia hema)
	{	return repo_hema.save(hema);	}
	
	public SclExamenquimicaclinica insertar(SclExamenquimicaclinica qcl)
	{	return repo_qcl.save(qcl);		}
	
	//Metodos update
	public SclExamencoprologia actualizar(SclExamencoprologia co) {
		if(repo_copro.existsById(co.getSclExamencoprologiaPK()))
			return repo_copro.save(co);
		else return null;
	}
	
	public SclExamenurianalisis actualizar(SclExamenurianalisis uri) {
		if(repo_uri.existsById(uri.getSclExamenurianalisisPK()))
			return repo_uri.save(uri);
		else return null;
	}
	
	public SclExamenhematologia actualizar(SclExamenhematologia hema) {
		if(repo_hema.existsById(hema.getSclExamenhematologiaPK()))
			return repo_hema.save(hema);
		else return null;
	}
	
	public SclExamenquimicaclinica actualizar(SclExamenquimicaclinica qcl) {
		if(repo_qcl.existsById(qcl.getSclExamenquimicaclinicaPK()))
			return repo_qcl.save(qcl);
		else return null;
	}
	
	//Metodos delete
	public void eliminar(SclExamencoprologia co) {
		if(repo_copro.existsById(co.getSclExamencoprologiaPK()))
			repo_copro.deleteById(co.getSclExamencoprologiaPK());
	}
	
	public void eliminar(SclExamenurianalisis uri) {
		if(repo_uri.existsById(uri.getSclExamenurianalisisPK()))
			repo_uri.deleteById(uri.getSclExamenurianalisisPK());
	}
	
	public void eliminar(SclExamenhematologia hema) {
		if(repo_hema.existsById(hema.getSclExamenhematologiaPK()))
			repo_hema.deleteById(hema.getSclExamenhematologiaPK());
	}
	
	public void eliminar(SclExamenquimicaclinica qcl) {
		if(repo_qcl.existsById(qcl.getSclExamenquimicaclinicaPK()))
			repo_qcl.deleteById(qcl.getSclExamenquimicaclinicaPK());
	}
}
