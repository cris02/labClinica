package com.api.labClinico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.labClinico.models.SclExamencoprologia;
import com.api.labClinico.models.SclExamencoprologiaPK;

@Repository
public interface ExamenCoproRepository extends JpaRepository<SclExamencoprologia, SclExamencoprologiaPK>{

}
