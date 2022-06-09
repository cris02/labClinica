package com.api.labClinico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.labClinico.models.SclHechosArea;
import com.api.labClinico.models.SclHechosAreaPK;

@Repository
public interface HechosAreaRepository extends JpaRepository<SclHechosArea, SclHechosAreaPK> {

}
