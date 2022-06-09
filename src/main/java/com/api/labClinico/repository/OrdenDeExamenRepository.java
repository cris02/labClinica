package com.api.labClinico.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.labClinico.models.SclOrdendeexamen;
import com.api.labClinico.models.SclPaciente;

@Repository
public interface OrdenDeExamenRepository extends JpaRepository <SclOrdendeexamen, Integer> {
    
	List<SclOrdendeexamen> findByIdPaciente(SclPaciente idPaciente);
}
