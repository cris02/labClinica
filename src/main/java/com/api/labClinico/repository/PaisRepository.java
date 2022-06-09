package com.api.labClinico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.labClinico.models.SclPais;

@Repository
public interface PaisRepository extends JpaRepository<SclPais, String> {

}
