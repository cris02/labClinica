package com.api.labClinico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.labClinico.models.SclRangoEdad;

@Repository
public interface RangoEdadRepository extends JpaRepository<SclRangoEdad, Integer> {

}
