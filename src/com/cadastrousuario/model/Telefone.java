package com.cadastrousuario.model;

public class Telefone {
	private Integer foneId;
	private Integer foneDdd;
	private String foneNumero;
	private String foneTipo;
	public Telefone() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Telefone(Integer foneId, Integer foneDdd, String foneNumero, String foneTipo) {
		super();
		this.foneId = foneId;
		this.foneDdd = foneDdd;
		this.foneNumero = foneNumero;
		this.foneTipo = foneTipo;
	}
	public Integer getFoneId() {
		return foneId;
	}
	public void setFoneId(Integer foneId) {
		this.foneId = foneId;
	}
	public Integer getFoneDdd() {
		return foneDdd;
	}
	public void setFoneDdd(Integer foneDdd) {
		this.foneDdd = foneDdd;
	}
	public String getFoneNumero() {
		return foneNumero;
	}
	public void setFoneNumero(String foneNumero) {
		this.foneNumero = foneNumero;
	}
	public String getFoneTipo() {
		return foneTipo;
	}
	public void setFoneTipo(String foneTipo) {
		this.foneTipo = foneTipo;
	}
	
	

}
