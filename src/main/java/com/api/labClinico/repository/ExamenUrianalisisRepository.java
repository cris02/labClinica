package com.api.labClinico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.labClinico.models.SclExamenurianalisis;
import com.api.labClinico.models.SclExamenurianalisisPK;

@Repository
public interface ExamenUrianalisisRepository extends JpaRepository <SclExamenurianalisis, SclExamenurianalisisPK> {
    
    
}
