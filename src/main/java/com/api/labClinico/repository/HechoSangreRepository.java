package com.api.labClinico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.labClinico.models.SclHechoSangre;
import com.api.labClinico.models.SclHechoSangrePK;

@Repository
public interface HechoSangreRepository extends JpaRepository<SclHechoSangre, SclHechoSangrePK> {

}
