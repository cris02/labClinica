package com.api.labClinico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.labClinico.models.SclUsuario;
import com.api.labClinico.request.LoginResponse;
import com.api.labClinico.service.SecurityService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/sec")
public class SecurityController {
	
	@Autowired
	private SecurityService service;
	
	
	@GetMapping("/login")
	public LoginResponse login(@RequestParam String email, String c) {
		
		return null;//userdetailsserv.login(email, c);
	}
    
	
    @GetMapping("/flag") //?id=
    public SclUsuario darDeBaja(@RequestParam Integer id) {
    	return service.darDeBaja(id);
    }
    
	
	@GetMapping("/reset") //?email=
    public String solicitudReinicio(@RequestParam String email) {
		return service.solicitarReinicio(email);
	}
    
	
    @GetMapping("/send") //?id=
    public String sendMail(@RequestParam Integer id) {
    	return service.generarClave(id);
    }
    
    
    @GetMapping("/psw") //?email= ... &c1= ... &c2= ...
    public String resetPassword(@RequestParam String email, String c1, String c2) {
    	return service.cambioClave(email, c1, c2);
    }
    
}
