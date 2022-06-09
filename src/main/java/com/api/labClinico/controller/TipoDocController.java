
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

import com.api.labClinico.models.SclTipoDocumento;
import com.api.labClinico.service.TipoDocumentoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/tipodocumento")
public class TipoDocController
{
    @Autowired
    private TipoDocumentoService tipodocumentoservicio;
    
    @GetMapping("/all")
    public List<SclTipoDocumento> listar()
    { return tipodocumentoservicio.listar(); }
    
    @PostMapping
    public SclTipoDocumento insertar(@RequestBody SclTipoDocumento a_obj)
    { return tipodocumentoservicio.insertar(a_obj); }
    
    @PutMapping
    public SclTipoDocumento actualizar(@RequestBody SclTipoDocumento a_obj)
    { return tipodocumentoservicio.actualizar(a_obj); }
    
    @DeleteMapping
    public void eliminar(@RequestBody SclTipoDocumento usu)
    { tipodocumentoservicio.eliminar(usu); }
    
}
