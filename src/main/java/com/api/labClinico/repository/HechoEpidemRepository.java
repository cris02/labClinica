package com.api.labClinico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.labClinico.models.SclHechoEpidemiologia;
import com.api.labClinico.models.SclHechoEpidemiologiaPK;

@Repository
public interface HechoEpidemRepository extends JpaRepository<SclHechoEpidemiologia, SclHechoEpidemiologiaPK> {

}
