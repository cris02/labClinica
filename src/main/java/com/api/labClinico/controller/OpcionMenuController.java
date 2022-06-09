
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

import com.api.labClinico.models.SclOpcionmenu;
import com.api.labClinico.service.OpcionMenuService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/opcionmenu")
public class OpcionMenuController
{
    @Autowired
    private OpcionMenuService objservicio;
    
    @GetMapping
    public List<SclOpcionmenu> listar()
    { return objservicio.listar(); }
    
    @PostMapping
    public SclOpcionmenu insertar(@RequestBody SclOpcionmenu usu)
    { return objservicio.insertar(usu); }
    
    @PutMapping
    public SclOpcionmenu actualizar(@RequestBody SclOpcionmenu usu)
    { return objservicio.actualizar(usu); }
    
    @DeleteMapping
    public void eliminar(@RequestBody SclOpcionmenu usu)
    { objservicio.eliminar(usu); }
    
}
