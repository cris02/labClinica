package com.api.labClinico.request;

import com.api.labClinico.models.SclUsuario;

public class LoginRequest {
	private SclUsuario usuario;
	private boolean isUserValidate;
	
	public LoginRequest() {
		super();
	}
	
	public LoginRequest(SclUsuario usuario, boolean isUserValidate) {
		super();
		this.isUserValidate = isUserValidate;
		this.usuario = usuario;
	}

	public boolean isUserValidate() {
		return isUserValidate;
	}

	public void setUserValidate(boolean isUserValidate) {
		this.isUserValidate = isUserValidate;
	}

	public SclUsuario getUsuario() {
		return usuario;
	}

	public void setUsuario(SclUsuario usuario) {
		this.usuario = usuario;
	}
	
}
