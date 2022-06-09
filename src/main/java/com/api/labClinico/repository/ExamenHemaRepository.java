package com.api.labClinico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.labClinico.models.SclExamenhematologia;
import com.api.labClinico.models.SclExamenhematologiaPK;

@Repository
public interface ExamenHemaRepository extends JpaRepository<SclExamenhematologia, SclExamenhematologiaPK> {

}
