package com.cadastrousuario.model;

public class Telefone {
	private Integer telefoneId;
	private Integer telefoneDdd;
	private String telefoneNumero;
	private String telefoneTipo;
	private int usuarioId;
	
	
	public Telefone() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Telefone(Integer telefoneDdd, String telefoneNumero, String telefoneTipo, int usuarioId) {
		super();
		this.telefoneDdd = telefoneDdd;
		this.telefoneNumero = telefoneNumero;
		this.telefoneTipo = telefoneTipo;
		this.usuarioId = usuarioId;
	}


	public Telefone(Integer telefoneId, Integer telefoneDdd, String telefoneNumero, String telefoneTipo,
			int usuarioId) {
		super();
		this.telefoneId = telefoneId;
		this.telefoneDdd = telefoneDdd;
		this.telefoneNumero = telefoneNumero;
		this.telefoneTipo = telefoneTipo;
		this.usuarioId = usuarioId;
	}


	public Integer getTelefoneId() {
		return telefoneId;
	}


	public void setTelefoneId(Integer telefoneId) {
		this.telefoneId = telefoneId;
	}


	public Integer getTelefoneDdd() {
		return telefoneDdd;
	}


	public void setTelefoneDdd(Integer telefoneDdd) {
		this.telefoneDdd = telefoneDdd;
	}


	public String getTelefoneNumero() {
		return telefoneNumero;
	}


	public void setTelefoneNumero(String telefoneNumero) {
		this.telefoneNumero = telefoneNumero;
	}


	public String getTelefoneTipo() {
		return telefoneTipo;
	}


	public void setTelefoneTipo(String telefoneTipo) {
		this.telefoneTipo = telefoneTipo;
	}


	public int getUsuarioId() {
		return usuarioId;
	}


	public void setUsuarioId(int usuarioId) {
		this.usuarioId = usuarioId;
	}

	
	
	


}
