package com.api.labClinico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.labClinico.models.SclOpcionmenu;


@Repository
public interface OpcionMenuRepository extends JpaRepository <SclOpcionmenu, Integer>
{
    
    
}
