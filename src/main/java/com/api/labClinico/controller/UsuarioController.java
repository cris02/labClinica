
package com.api.labClinico.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.labClinico.models.SclUsuario;
import com.api.labClinico.service.UsuarioService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/usuario")
public class UsuarioController
{
    @Autowired
    private UsuarioService usuarioservicio;

    
    @GetMapping("/all")
    public List<SclUsuario> listar()
    { 	return usuarioservicio.listar(); 	}
    
    @GetMapping("/find")
    public SclUsuario listarId(@RequestParam Integer id)
    { 	return usuarioservicio.listarId(id); 	}
    
    @PostMapping("/save")
    public SclUsuario insertar(@RequestBody SclUsuario usu) 
    { 	return usuarioservicio.insertar(usu);	}
    
    
    @PutMapping("/upd")
    public SclUsuario actualizar(@RequestBody SclUsuario usu)
    { 	return usuarioservicio.actualizar(usu);	}

}
