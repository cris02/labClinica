package com.api.labClinico.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.labClinico.models.SclMunicipioPK;
import com.api.labClinico.models.SclPaciente;
import com.api.labClinico.repository.PacienteRepository;
import com.api.labClinico.request.PacienteRequest;

@Service
public class PacienteService
{
    @Autowired
    private PacienteRepository pacienterepositorio;
    @Autowired
	private ClinicaService clinicaserv;
	@Autowired
	private TipoDocumentoService tipodocserv;
	@Autowired
	private MunicipioService municipioserv;

    public List<SclPaciente> listar()
    { return pacienterepositorio.findAll(); }
    
    public SclPaciente listarId(Integer id) {
    	return pacienterepositorio.findById(id).orElse(null);
    }
    
    
    public SclPaciente insertar(PacienteRequest pac) {
    	SclPaciente newPac = new SclPaciente();
    	newPac.setIdPaciente((int) pacienterepositorio.count()+1);
		newPac.setIdClinica(clinicaserv.findById(pac.getIdClinica()));
		newPac.setIdTipoDocumento(tipodocserv.listarId(pac.getIdTipoDocumento()));
		newPac.setSclMunicipio(municipioserv.listarId(new SclMunicipioPK(
				pac.getIdPais(), 
				pac.getIdDepto(), 
				pac.getIdMunicipio())));
		newPac.setActivoPaciente(pac.isActivoPaciente());
		newPac.setNumDocumento(pac.getNumDocumento());
		newPac.setNomPaciente(pac.getNomPaciente());
		newPac.setApePaciente(pac.getApePaciente());
		newPac.setApeCasada(pac.getApeCasada());
		newPac.setNomRespondable(pac.getNomRespondable());
		newPac.setGenero(pac.isGenero());
		newPac.setFechanacimiento(pac.getFechanacimiento());
		newPac.setTelPaciente(pac.getTelPaciente());
		newPac.setTelResponsable(pac.getTelResponsable());
		newPac.setEstadoCivil(pac.getEstadoCivil());
		newPac.setCasadepto(pac.getCasadepto());
		newPac.setPjesenda(pac.getPjesenda());
		newPac.setColbarrio(pac.getColbarrio());
		newPac.setCalleav(pac.getCalleav());
		newPac.setDetalledireccion(pac.getDetalledireccion());
    	
    	return pacienterepositorio.save(newPac);
    }
    
    
    public SclPaciente actualizar(PacienteRequest pac)
    { 
    	if(pacienterepositorio.existsById(pac.getIdPaciente())) {
    		SclPaciente newPac = new SclPaciente();
        	newPac.setIdPaciente(pac.getIdPaciente());
    		newPac.setIdClinica(clinicaserv.findById(pac.getIdClinica()));
    		newPac.setIdTipoDocumento(tipodocserv.listarId(pac.getIdTipoDocumento()));
    		newPac.setSclMunicipio(municipioserv.listarId(new SclMunicipioPK(
    				pac.getIdPais(), 
    				pac.getIdDepto(), 
    				pac.getIdMunicipio())));
    		newPac.setActivoPaciente(pac.isActivoPaciente());
    		newPac.setNumDocumento(pac.getNumDocumento());
    		newPac.setNomPaciente(pac.getNomPaciente());
    		newPac.setApePaciente(pac.getApePaciente());
    		newPac.setApeCasada(pac.getApeCasada());
    		newPac.setNomRespondable(pac.getNomRespondable());
    		newPac.setGenero(pac.isGenero());
    		newPac.setFechanacimiento(pac.getFechanacimiento());
    		newPac.setTelPaciente(pac.getTelPaciente());
    		newPac.setTelResponsable(pac.getTelResponsable());
    		newPac.setEstadoCivil(pac.getEstadoCivil());
    		newPac.setCasadepto(pac.getCasadepto());
    		newPac.setPjesenda(pac.getPjesenda());
    		newPac.setColbarrio(pac.getColbarrio());
    		newPac.setCalleav(pac.getCalleav());
    		newPac.setDetalledireccion(pac.getDetalledireccion());
    		
    		return pacienterepositorio.save(newPac);
    	}
    	else
    		return null;
    }
    
    
    public void eliminar(Integer id) { 
    	if(pacienterepositorio.existsById(id))
    		pacienterepositorio.deleteById(id);
    }
}

