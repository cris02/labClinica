package com.api.labClinico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.labClinico.models.SclValreferencia;

@Repository
public interface ValreferenciaRepository extends JpaRepository<SclValreferencia, Integer> {

}
