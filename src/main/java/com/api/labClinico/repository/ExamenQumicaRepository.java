package com.api.labClinico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.labClinico.models.SclExamenquimicaclinica;
import com.api.labClinico.models.SclExamenquimicaclinicaPK;

@Repository
public interface ExamenQumicaRepository extends JpaRepository<SclExamenquimicaclinica, SclExamenquimicaclinicaPK> {

}
