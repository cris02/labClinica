package com.api.labClinico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.labClinico.models.SclClinica;

@Repository
public interface ClinicaRepository  extends JpaRepository<SclClinica, Integer> {

}
