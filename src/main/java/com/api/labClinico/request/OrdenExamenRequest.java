package com.api.labClinico.request;

import java.util.Date;

public class OrdenExamenRequest {
	
	private Integer idOrdenexamen;
	private Integer idPaciente;
    private Date fechaMuestra;
    private Date horaMuestra;
    private Integer cantSangre;
    private Integer cantHeces;
    private Integer cantOrina;
    private String uniSangre;
    private String uniHeces;
    private String uniOrina;

	public Integer getIdOrdenexamen() {
		return idOrdenexamen;
	}

	public void setIdOrdenexamen(Integer idOrdenexamen) {
		this.idOrdenexamen = idOrdenexamen;
	}

	public Integer getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
	}

	public Date getFechaMuestra() {
		return fechaMuestra;
	}

	public void setFechaMuestra(Date fechaMuestra) {
		this.fechaMuestra = fechaMuestra;
	}

	public Date getHoraMuestra() {
		return horaMuestra;
	}

	public void setHoraMuestra(Date horaMuestra) {
		this.horaMuestra = horaMuestra;
	}

	public Integer getCantSangre() {
		return cantSangre;
	}

	public void setCantSangre(Integer cantSangre) {
		this.cantSangre = cantSangre;
	}

	public Integer getCantHeces() {
		return cantHeces;
	}

	public void setCantHeces(Integer cantHeces) {
		this.cantHeces = cantHeces;
	}

	public Integer getCantOrina() {
		return cantOrina;
	}

	public void setCantOrina(Integer cantOrina) {
		this.cantOrina = cantOrina;
	}

	public String getUniSangre() {
		return uniSangre;
	}

	public void setUniSangre(String uniSangre) {
		this.uniSangre = uniSangre;
	}

	public String getUniHeces() {
		return uniHeces;
	}

	public void setUniHeces(String uniHeces) {
		this.uniHeces = uniHeces;
	}

	public String getUniOrina() {
		return uniOrina;
	}

	public void setUniOrina(String uniOrina) {
		this.uniOrina = uniOrina;
	}

}
