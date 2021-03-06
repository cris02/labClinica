
package com.api.labClinico.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.labClinico.models.SclRol;
import com.api.labClinico.service.RolService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/rol")
public class RolController
{
    @Autowired
    private RolService objservicio;
    
    @GetMapping("/all")
    public List<SclRol> listar()
    { return objservicio.listar(); }
    
    @PostMapping("/save")
    public SclRol insertar(@RequestBody SclRol usu)
    { return objservicio.insertar(usu); }
    
    @PutMapping("/upd")
    public SclRol actualizar(@RequestBody SclRol usu)
    { return objservicio.actualizar(usu); }
    
    @DeleteMapping("/del")
    public void eliminar(@RequestBody SclRol usu)
    { objservicio.eliminar(usu); }
    
}
