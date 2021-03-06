/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.labClinico.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 *
 * @author crist
 */
@Entity
@Table(name = "scl_municipio", catalog = "labclinicodb", schema = "public", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"id_pais", "id_depto", "id_municipio"})})
@NamedQueries({
    @NamedQuery(name = "SclMunicipio.findAll", query = "SELECT s FROM SclMunicipio s")})
public class SclMunicipio implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SclMunicipioPK sclMunicipioPK;
    @Basic(optional = false)
    @Column(name = "nom_municipio", nullable = false, length = 35)
    private String nomMunicipio;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sclMunicipio", fetch = FetchType.LAZY)
    private List<SclHechosArea> sclHechosAreaList;
    @JsonIgnore
    @JoinColumns({
        @JoinColumn(name = "id_pais", referencedColumnName = "id_pais", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "id_depto", referencedColumnName = "id_depto", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SclDepartamento sclDepartamento;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sclMunicipio", fetch = FetchType.LAZY)
    private List<SclHechoSangre> sclHechoSangreList;
    @JsonIgnore
    @OneToMany(mappedBy = "sclMunicipio", fetch = FetchType.LAZY)
    private List<SclPaciente> sclPacienteList;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sclMunicipio", fetch = FetchType.LAZY)
    private List<SclHechoEpidemiologia> sclHechoEpidemiologiaList;

    public SclMunicipio() {
    }

    public SclMunicipio(SclMunicipioPK sclMunicipioPK) {
        this.sclMunicipioPK = sclMunicipioPK;
    }

    public SclMunicipio(SclMunicipioPK sclMunicipioPK, String nomMunicipio) {
        this.sclMunicipioPK = sclMunicipioPK;
        this.nomMunicipio = nomMunicipio;
    }

    public SclMunicipio(String idPais, int idDepto, int idMunicipio) {
        this.sclMunicipioPK = new SclMunicipioPK(idPais, idDepto, idMunicipio);
    }

    public SclMunicipioPK getSclMunicipioPK() {
        return sclMunicipioPK;
    }

    public void setSclMunicipioPK(SclMunicipioPK sclMunicipioPK) {
        this.sclMunicipioPK = sclMunicipioPK;
    }

    public String getNomMunicipio() {
        return nomMunicipio;
    }

    public void setNomMunicipio(String nomMunicipio) {
        this.nomMunicipio = nomMunicipio;
    }

    public List<SclHechosArea> getSclHechosAreaList() {
        return sclHechosAreaList;
    }

    public void setSclHechosAreaList(List<SclHechosArea> sclHechosAreaList) {
        this.sclHechosAreaList = sclHechosAreaList;
    }

    public SclDepartamento getSclDepartamento() {
        return sclDepartamento;
    }

    public void setSclDepartamento(SclDepartamento sclDepartamento) {
        this.sclDepartamento = sclDepartamento;
    }

    public List<SclHechoSangre> getSclHechoSangreList() {
        return sclHechoSangreList;
    }

    public void setSclHechoSangreList(List<SclHechoSangre> sclHechoSangreList) {
        this.sclHechoSangreList = sclHechoSangreList;
    }

    public List<SclPaciente> getSclPacienteList() {
        return sclPacienteList;
    }

    public void setSclPacienteList(List<SclPaciente> sclPacienteList) {
        this.sclPacienteList = sclPacienteList;
    }

    public List<SclHechoEpidemiologia> getSclHechoEpidemiologiaList() {
        return sclHechoEpidemiologiaList;
    }

    public void setSclHechoEpidemiologiaList(List<SclHechoEpidemiologia> sclHechoEpidemiologiaList) {
        this.sclHechoEpidemiologiaList = sclHechoEpidemiologiaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sclMunicipioPK != null ? sclMunicipioPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SclMunicipio)) {
            return false;
        }
        SclMunicipio other = (SclMunicipio) object;
        if ((this.sclMunicipioPK == null && other.sclMunicipioPK != null) || (this.sclMunicipioPK != null && !this.sclMunicipioPK.equals(other.sclMunicipioPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencialabv1.models.SclMunicipio[ sclMunicipioPK=" + sclMunicipioPK + " ]";
    }
    
}
